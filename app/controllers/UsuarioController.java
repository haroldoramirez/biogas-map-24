package controllers;

import akka.util.Crypt;
import autenticadores.UsuarioAutenticado;
import daos.TokenDeCadastroDAO;
import daos.UsuarioDAO;
import models.*;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import validadores.ValidadorDeUsuario;

import javax.inject.Inject;
import java.util.Optional;

public class UsuarioController extends Controller {

    public static final String AUTH = "AUTH";

    static private DynamicForm formularios = Form.form();

    @Inject
    private ValidadorDeUsuario validadorDeUsuario;

    @Inject
    private MailerClient enviador;

    @Inject
    private UsuarioDAO usuarioDAO;

    @Inject
    private TokenDeCadastroDAO tokenDeCadastroDAO;

    public Result formularioDeNovoUsuario() {
        Form<Usuario> formulario = formularios.form(Usuario.class);
        return ok(views.html.admin.usuarios.formularioDeNovoUsuario.render(formulario));
    }

    public Result salvaNovoUsuario() {
        Form<Usuario> formulario = formularios.form(Usuario.class).bindFromRequest();

        if (validadorDeUsuario.temErros(formulario)) {
            flash("danger", "Há erros no formulário de cadastro!");
            return badRequest(views.html.admin.usuarios.formularioDeNovoUsuario.render(formulario));
        }
        Usuario usuario = formulario.get();
        String senhaCrupto = Crypt.sha1(usuario.getSenha());
        usuario.setSenha(senhaCrupto);
        usuario.save();
        TokenDeCadastro token = new TokenDeCadastro(usuario);
        token.save();
        enviador.send(new EmailDeCadastro(token));
        flash("success", "Um email foi enviado para confirmar o seu cadastro!");
        return redirect(routes.UsuarioController.formularioDeLogin());
    }

    public Result confirmaUsuario(String email, String codigo) {
        Optional<Usuario> possivelUsuario = usuarioDAO.comEmail(email);
        Optional<TokenDeCadastro> possivelToken = tokenDeCadastroDAO.comCodigo(codigo);
        if (possivelToken.isPresent() && possivelToken.isPresent()) {
            TokenDeCadastro token = possivelToken.get();
            Usuario usuario = possivelUsuario.get();
            if (token.getUsuario().equals(usuario)) {
                token.delete();
                usuario.setVerificado(true);
                TokenDaApi tokenDaApi = new TokenDaApi(usuario);
                tokenDaApi.save();
                usuario.setToken(tokenDaApi);
                usuario.update();
                flash("success", "Cadastro confirmado com sucesso");
                insereUsuarioNaSessao(usuario);
                return redirect(routes.AdminController.painel());
            }
        }

        flash("danger", "Ocorreu um erro ao confirmar o cadastro!");
        return redirect(routes.UsuarioController.formularioDeLogin());
    }

    public Result formularioDeLogin() {
        return ok(views.html.admin.login.render(formularios.form()));
    }

    public Result autenticar() {

        DynamicForm formulario = formularios.form().bindFromRequest();

        String email = formulario.get("email");
        String senha = formulario.get("senha");

        System.out.println(email);
        System.out.println(senha);

        Optional<Usuario> possivelUsuario = Usuarios.existe(email, senha);

        if (possivelUsuario.isPresent()) {
            Usuario usuario = possivelUsuario.get();
            if (usuario.isVerificado()) {
                insereUsuarioNaSessao(usuario);
                flash("success", "Login foi efetuado com sucesso!");
                return redirect(routes.AdminController.painel());
            }
            else {
                flash("warning", "O usuário ainda não confirmado! Confira seu email");
            }
        }
        else {
            flash("danger", "Credenciais inválidas");
        }

        return redirect(routes.UsuarioController.formularioDeLogin());
    }

    @Security.Authenticated(UsuarioAutenticado.class)
    public Result logout() {
        session().clear();
        flash("success", "Logout efetuado com sucesso!");
        return redirect(routes.UsuarioController.formularioDeLogin());
    }

    private void insereUsuarioNaSessao(Usuario usuario) {
        session(AUTH, usuario.getToken().getCodigo());
    }

}
