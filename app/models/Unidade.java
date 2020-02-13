package models;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Unidade extends BaseModel {

    /*-------------------------------------------------------------------
     *	ATTRIBUTES
     *-------------------------------------------------------------------*/

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    private Situacao situacao;

    @ManyToOne
    private Escala escala;

    @ManyToOne
    private FonteDoSubstrato fonteDoSubstrato;

    @ManyToOne
    private Tecnologia tecnologia;

    @ManyToOne
    private Municipio municipio;

    @Column(nullable = false)
    private Boolean biogasParaEnergiaTermica;

    @Column(nullable = false)
    private Boolean biogasParaEnergiaEletrica;

    @Column(nullable = false)
    private Boolean biogasParaEnergiaMecanica;

    @Column(nullable = false)
    private Boolean biogasParaBiometano;

    @Column(nullable = false)
    private Boolean valorEstimado;

    @Column(nullable = false)
    private Long codigo;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column(nullable = false)
    private Long producaoDiaria;

    @Column(nullable = false)
    private Long producaoAnual;

    @Column(nullable = false)
    private String anoDeInicioOperacao;

    @Column(nullable = false)
    private Long emissaodeGEEevitado;

    @Column(nullable = false)
    private Long volumeDejetoTratadoDia;

    @Column(nullable = false)
    private Long volumeDejetoTratadoAno;

    @Column(nullable = false)
    private Long volumeCompostagemDia;

    @Column(nullable = false)
    private Long volumeCompostagemAno;

    @Column(nullable = false)
    private Long producaoBiogasDia;

    @Column(nullable = false)
    private Long producaoBiogasAno;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCadastro;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAlteracao;

    /*-------------------------------------------------------------------
     *	GETTERS AND SETTERS
     *-------------------------------------------------------------------*/

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Escala getEscala() {
        return escala;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }

    public FonteDoSubstrato getFonteDoSubstrato() {
        return fonteDoSubstrato;
    }

    public void setFonteDoSubstrato(FonteDoSubstrato fonteDoSubstrato) {
        this.fonteDoSubstrato = fonteDoSubstrato;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Boolean getBiogasParaEnergiaTermica() {
        return biogasParaEnergiaTermica;
    }

    public void setBiogasParaEnergiaTermica(Boolean biogasParaEnergiaTermica) {
        this.biogasParaEnergiaTermica = biogasParaEnergiaTermica;
    }

    public Boolean getBiogasParaEnergiaEletrica() {
        return biogasParaEnergiaEletrica;
    }

    public void setBiogasParaEnergiaEletrica(Boolean biogasParaEnergiaEletrica) {
        this.biogasParaEnergiaEletrica = biogasParaEnergiaEletrica;
    }

    public Boolean getBiogasParaEnergiaMecanica() {
        return biogasParaEnergiaMecanica;
    }

    public void setBiogasParaEnergiaMecanica(Boolean biogasParaEnergiaMecanica) {
        this.biogasParaEnergiaMecanica = biogasParaEnergiaMecanica;
    }

    public Boolean getBiogasParaBiometano() {
        return biogasParaBiometano;
    }

    public void setBiogasParaBiometano(Boolean biogasParaBiometano) {
        this.biogasParaBiometano = biogasParaBiometano;
    }

    public Boolean getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(Boolean valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getProducaoDiaria() {
        return producaoDiaria;
    }

    public void setProducaoDiaria(Long producaoDiaria) {
        this.producaoDiaria = producaoDiaria;
    }

    public Long getProducaoAnual() {
        return producaoAnual;
    }

    public void setProducaoAnual(Long producaoAnual) {
        this.producaoAnual = producaoAnual;
    }

    public String getAnoDeInicioOperacao() {
        return anoDeInicioOperacao;
    }

    public void setAnoDeInicioOperacao(String anoDeInicioOperacao) {
        this.anoDeInicioOperacao = anoDeInicioOperacao;
    }

    public Long getEmissaodeGEEevitado() {
        return emissaodeGEEevitado;
    }

    public void setEmissaodeGEEevitado(Long emissaodeGEEevitado) {
        this.emissaodeGEEevitado = emissaodeGEEevitado;
    }

    public Long getVolumeDejetoTratadoDia() {
        return volumeDejetoTratadoDia;
    }

    public void setVolumeDejetoTratadoDia(Long volumeDejetoTratadoDia) {
        this.volumeDejetoTratadoDia = volumeDejetoTratadoDia;
    }

    public Long getVolumeDejetoTratadoAno() {
        return volumeDejetoTratadoAno;
    }

    public void setVolumeDejetoTratadoAno(Long volumeDejetoTratadoAno) {
        this.volumeDejetoTratadoAno = volumeDejetoTratadoAno;
    }

    public Long getVolumeCompostagemDia() {
        return volumeCompostagemDia;
    }

    public void setVolumeCompostagemDia(Long volumeCompostagemDia) {
        this.volumeCompostagemDia = volumeCompostagemDia;
    }

    public Long getVolumeCompostagemAno() {
        return volumeCompostagemAno;
    }

    public void setVolumeCompostagemAno(Long volumeCompostagemAno) {
        this.volumeCompostagemAno = volumeCompostagemAno;
    }

    public Long getProducaoBiogasDia() {
        return producaoBiogasDia;
    }

    public void setProducaoBiogasDia(Long producaoBiogasDia) {
        this.producaoBiogasDia = producaoBiogasDia;
    }

    public Long getProducaoBiogasAno() {
        return producaoBiogasAno;
    }

    public void setProducaoBiogasAno(Long producaoBiogasAno) {
        this.producaoBiogasAno = producaoBiogasAno;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Calendar dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
