package models;

import com.avaje.ebean.annotation.JsonIgnore;
import play.data.format.Formats;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Escala extends BaseModel {

    /*-------------------------------------------------------------------
     *	ATTRIBUTES
     *-------------------------------------------------------------------*/

    @Column(nullable = false)
    private Long valor; // valor de referencia para o MENOR QUE

    @Column(nullable = false)
    private Long intervalo; // 1, 2 ou 3 (Pequeno, Médio, Grande)

    @Column(nullable = false)
    private String legenda; //
    /* < 1.250 m3/dia - Porte 1
     * 1251 a 2.500 m3/dia - Porte 2
     * 2501 a 8.500 m3/dia - Porte 3
     * 8501 a 12.500 m3/dia - Porte 4
     * 12501 a 85.500 m3/dia - Porte 5
     * 85501 a 350.000 m3/dia - Porte 6
     * > 350.000 m3/dia - Porte 7
     */
    @Column(nullable = false)
    private Long porte; /* Porte 1 , Porte 2, Porte 3 */

    @Formats.DateTime(pattern="YYYY-MM-DD")
    @Temporal(TemporalType.DATE)
    @JsonIgnore
    private Date dataCadastro;

    @Formats.DateTime(pattern="YYYY-MM-DD")
    @Temporal(TemporalType.DATE)
    @JsonIgnore
    private Date dataAlteracao;

    /*-------------------------------------------------------------------
     *	GETTERS AND SETTERS
     *-------------------------------------------------------------------*/

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Long getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(Long intervalo) {
        this.intervalo = intervalo;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public Long getPorte() {
        return porte;
    }

    public void setPorte(Long porte) {
        this.porte = porte;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
}
