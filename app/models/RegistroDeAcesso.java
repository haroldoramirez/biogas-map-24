package models;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class RegistroDeAcesso extends BaseModel {

    /*-------------------------------------------------------------------
     *	ATTRIBUTES
     *-------------------------------------------------------------------*/

    @ManyToOne
    private Usuario usuario;

    private String uri;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataDeAcesso;

    /*-------------------------------------------------------------------
     *	CONSTRUCTORS
     *-------------------------------------------------------------------*/

    public RegistroDeAcesso(Usuario usuario, String uri) {
        this.usuario = usuario;
        this.uri = uri;
        this.dataDeAcesso =  Calendar.getInstance();
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Calendar getDataDeAcesso() {
        return dataDeAcesso;
    }

    public void setDataDeAcesso(Calendar dataDeAcesso) {
        this.dataDeAcesso = dataDeAcesso;
    }
}
