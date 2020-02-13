package models;

import com.avaje.ebean.annotation.JsonIgnore;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
public class Usuario extends BaseModel {

    /*-------------------------------------------------------------------
     *	ATTRIBUTES
     *-------------------------------------------------------------------*/

    @Constraints.Required(message = "Campo título é obrigatório")
    private String nome;

    @Constraints.Required(message = "Campo email é obrigatório")
    private String email;

    @Constraints.Required(message = "Campo senha é obrigatório")
    private String senha;

    private boolean verificado;

    //um usuario para um token, para que nao cria uma referencia na tabela usuario e sim so no modelo
    @OneToOne(mappedBy = "usuario")
    private TokenDaApi token;

    @OneToMany(mappedBy = "usuario")
    private List<RegistroDeAcesso> acessos;

    //Declarar o papel padrão do usuário que é o usuario
    @Enumerated(EnumType.STRING)
    private Papel papel = Papel.USUARIO;

    @Column(nullable = false)
    @JsonIgnore
    private Boolean status;

    @Formats.DateTime(pattern="YYYY-MM-DD")
    @Temporal(TemporalType.DATE)
    @JsonIgnore
    private Date dataCadastro;

    @Formats.DateTime(pattern="YYYY-MM-DD")
    @Temporal(TemporalType.DATE)
    @JsonIgnore
    private Date dataAlteracao;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar ultimoAcesso;

    /*-------------------------------------------------------------------
     *	GETTERS AND SETTERS
     *-------------------------------------------------------------------*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    public TokenDaApi getToken() {
        return token;
    }

    public void setToken(TokenDaApi token) {
        this.token = token;
    }

    public List<RegistroDeAcesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<RegistroDeAcesso> acessos) {
        this.acessos = acessos;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public boolean isUsuario() {
        return papel == Papel.USUARIO;
    }

    public boolean isSupervisor() {
        return papel == Papel.SUPERVISOR;
    }

    public boolean isGerente() {
        return papel == Papel.GERENTE;
    }

    public boolean isAdministrador() {
        return papel == Papel.ADMINISTRADOR;
    }

    public Calendar getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Calendar ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }
}
