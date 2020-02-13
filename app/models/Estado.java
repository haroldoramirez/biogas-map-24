package models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Estado extends BaseModel {

    /*-------------------------------------------------------------------
     *  ATTRIBUTES
     *-------------------------------------------------------------------*/

    private Long ibgeCode;

    @Column(length = 80)
    private String nome;

    @Column(length = 4)
    private String sigla;

    @Column(length = 50)
    private String regiao;

    /*-------------------------------------------------------------------
     *	GETTERS AND SETTERS
     *-------------------------------------------------------------------*/

    public Long getIbgeCode() {
        return ibgeCode;
    }

    public void setIbgeCode(Long ibgeCode) {
        this.ibgeCode = ibgeCode;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
