package com.abia.agilagenda.api.usuario.model;


import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class UsuarioGrupoId {

	@ManyToOne
	@JoinColumn(name = "codigo_usuario")
	@JsonIgnore
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "codigo_grupo")
	@JsonIgnore
	private GrupoUsuario grupo;
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public GrupoUsuario getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoUsuario grupo) {
		this.grupo = grupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioGrupoId other = (UsuarioGrupoId) obj;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
}
