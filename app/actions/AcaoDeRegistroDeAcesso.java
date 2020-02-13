package actions;

import daos.UsuarioDAO;
import models.RegistroDeAcesso;
import models.Usuario;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

public class AcaoDeRegistroDeAcesso extends Action.Simple {

    @Inject
    private UsuarioDAO usuarioDAO;

    @Override
    public F.Promise<Result> call(Http.Context context) throws Throwable {

        String codigo = context.request().getHeader("API-Token");

        String uri = context.request().uri();
        Usuario usuario = usuarioDAO.comToken(codigo).get();

        RegistroDeAcesso acesso = new RegistroDeAcesso(usuario, uri);

        acesso.save();

        return delegate.call(context);
    }

}
