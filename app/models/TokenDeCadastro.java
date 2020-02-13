package models;

import akka.util.Crypt;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class TokenDeCadastro extends BaseModel {

    /*-------------------------------------------------------------------
     *	ATTRIBUTES
     *-------------------------------------------------------------------*/

    private String codigo;

    @OneToOne
    private Usuario usuario;

    /*-------------------------------------------------------------------
     *	CONSTRUCTORS
     *-------------------------------------------------------------------*/

    public TokenDeCadastro(Usuario usuario) {
        this.usuario = usuario;
        this.codigo = Crypt.sha1(usuario.getNome()+usuario.getEmail()+ Crypt.generateSecureCookie());
    }

    /*-------------------------------------------------------------------
     *	GETTERS AND SETTERS
     *-------------------------------------------------------------------*/

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
