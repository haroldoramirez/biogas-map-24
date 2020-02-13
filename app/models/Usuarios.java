package models;

import com.avaje.ebean.Ebean;
import org.mindrot.jbcrypt.BCrypt;
import play.Logger;

import java.util.Calendar;
import java.util.Optional;

public class Usuarios extends BaseModel {

    public static Optional<Usuario> existe(String email, String senha) {

        try {

            Usuario usuario = Ebean.find(Usuario.class).where().eq("email", email).findUnique();

            if (usuario != null && BCrypt.checkpw(senha, usuario.getSenha())) {
                usuario.setUltimoAcesso(Calendar.getInstance());
                usuario.update();
                return Optional.of(usuario);
            } else {
                return Optional.empty();
            }

        } catch (Exception e) {
            Logger.error(e.getMessage());
            return Optional.empty();
        }
    }
}
