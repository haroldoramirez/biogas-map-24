package models;

import akka.util.Crypt;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class TokenDaApi extends BaseModel {

    /*-------------------------------------------------------------------
     *	ATTRIBUTES
     *-------------------------------------------------------------------*/

    @OneToOne
    private Usuario usuario;

    private String codigo;

    private Date expicacao;

    public TokenDaApi(Usuario usuario) {
        this.usuario = usuario;
        this.expicacao = new Date();
        this.codigo = Crypt.sha1(Crypt.generateSecureCookie()+expicacao.toString()+usuario.toString());
    }

    /*-------------------------------------------------------------------
     *	GETTERS AND SETTERS
     *-------------------------------------------------------------------*/

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getExpicacao() {
        return expicacao;
    }

    public void setExpicacao(Date expicacao) {
        this.expicacao = expicacao;
    }
}
