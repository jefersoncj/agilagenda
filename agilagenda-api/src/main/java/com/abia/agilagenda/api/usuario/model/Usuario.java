package com.abia.agilagenda.api.usuario.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;

    @Transient
    private String confirmacaoSenha;

    private Boolean ativo;

    @ManyToMany
    @JoinTable(
            name = "usuario_grupo",
            joinColumns = @JoinColumn(name = "codigo_usuario"),
            inverseJoinColumns = @JoinColumn(name = "codigo_grupo"))
    private List<GrupoUsuario> grupos;


    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    public Usuario() {

    }

    public Usuario(Long codigo, String nome, String sobrenome, String email, String senha, String confirmacaoSenha,
			Boolean ativo, List<GrupoUsuario> grupos, LocalDate dataNascimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
		this.confirmacaoSenha = confirmacaoSenha;
		this.ativo = ativo;
		this.grupos = grupos;
		this.dataNascimento = dataNascimento;
	}

	public Long getCodigo() {
        return codigo;
    }

    public void setCodigo( Long codigo ) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome( String sobrenome ) {
        this.sobrenome = sobrenome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha( String senha ) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo( Boolean ativo ) {
        this.ativo = ativo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento( LocalDate dataNascimento ) {
        this.dataNascimento = dataNascimento;
    }

    public List<GrupoUsuario> getGrupos() {
        return grupos;
    }

    public void setGrupos( List<GrupoUsuario> grupos ) {
        this.grupos = grupos;
    }

	public String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }

    public void setConfirmacaoSenha( String confirmacaoSenha ) {
        this.confirmacaoSenha = confirmacaoSenha;
    }

    public boolean isNovo() {
        return codigo == null;
    }
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( codigo == null ) ? 0 : codigo.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Usuario other = (Usuario) obj;
        if ( codigo == null ) {
            if ( other.codigo != null )
                return false;
        } else if ( !codigo.equals( other.codigo ) )
            return false;
        return true;
    }

}
