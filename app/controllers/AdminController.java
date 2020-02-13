package controllers;

import autenticadores.AdminAutenticado;
import autenticadores.UsuarioAutenticado;
import daos.UsuarioDAO;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.admin.usuarios.usuarios;

import javax.inject.Inject;
import java.util.List;

@Security.Authenticated(AdminAutenticado.class)
public class AdminController extends Controller {

    public static final String AUTH = "AUTH";

    @Inject
    private UsuarioDAO usuarioDAO;

    public Result usuarios() {
        List<Usuario> listaDeUsuarios =  usuarioDAO.todos();
        return ok(usuarios.render(listaDeUsuarios));
    }

    @Security.Authenticated(UsuarioAutenticado.class)
    public Result painel() {
        String codigo = session(AUTH);
        Usuario usuario = usuarioDAO.comToken(codigo).get();
        return ok(views.html.admin.painel.render(usuario));
    }

    @Security.Authenticated(UsuarioAutenticado.class)
    public Result paginaApi() {
        String codigo = session(AUTH);
        Usuario usuario = usuarioDAO.comToken(codigo).get();
        return ok(views.html.admin.api.render(usuario));
    }

}
