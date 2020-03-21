package com.abia.agilagenda.api.usuario.repository.helper.usuario;

import java.util.List;

import com.abia.agilagenda.api.usuario.model.Usuario;

public interface UsuarioRepositoryQueries {

	public List<String> permissoes(Usuario usuario);
}
