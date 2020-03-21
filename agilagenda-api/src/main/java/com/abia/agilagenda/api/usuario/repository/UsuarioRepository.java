package com.abia.agilagenda.api.usuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abia.agilagenda.api.usuario.model.Usuario;
import com.abia.agilagenda.api.usuario.repository.helper.usuario.UsuarioRepositoryQueries;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, UsuarioRepositoryQueries {
	
	public Optional<Usuario> findByEmail(String email);
	
	
}
