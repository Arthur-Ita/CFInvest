package br.com.cfinvest.dao;

import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.cfinvest.model.Usuario;

public class UsuarioDao extends GenericDao<Usuario>{

	public Usuario buscarPorUsername(String username) {
		emf = Persistence.createEntityManagerFactory("cfinvestPU");
		em = emf.createEntityManager();
		Query q = em.createNativeQuery("Select * from Usuario where Usuario.username = ?");
		q.setParameter(1, username);
		Usuario usr = (Usuario) q.getSingleResult();
	}
}
