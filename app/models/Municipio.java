package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Municipio  extends BaseModel {

    /*-------------------------------------------------------------------
     *  ATTRIBUTES
     *-------------------------------------------------------------------*/

    private String nome;
    private String uf;

    @ManyToOne
    private Estado estado;

    /*-------------------------------------------------------------------
     *	GETTERS AND SETTERS
     *-------------------------------------------------------------------*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
