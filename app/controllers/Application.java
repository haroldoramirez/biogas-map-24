package controllers;

import daos.UsuarioDAO;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Optional;

public class Application extends Controller {

    @Inject
    private UsuarioDAO usuarioDAO;

    /**
     * show index page
     *
     * @return index page if user auth or not auth
     */
    public Result index() {

        String email = session().get("email");

        Optional<Usuario> possivelUsuario = usuarioDAO.comEmail(email);

        if (possivelUsuario.isPresent()) {
            Usuario usuario = possivelUsuario.get();
            return ok(views.html.index.render(usuario));
        } else {
            return ok(views.html.index.render(null));
        }

    }
}
