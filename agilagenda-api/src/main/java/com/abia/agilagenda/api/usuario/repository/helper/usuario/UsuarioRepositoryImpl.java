package com.abia.agilagenda.api.usuario.repository.helper.usuario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.abia.agilagenda.api.usuario.model.Usuario;

public class UsuarioRepositoryImpl implements UsuarioRepositoryQueries{
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<String> permissoes(Usuario usuario) {
		return manager.createQuery(
				"select distinct p.nome from Usuario u inner join u.grupos g inner join g.permissoes p where u = :usuario", String.class)
				.setParameter("usuario", usuario)
				.getResultList();
	}

}
