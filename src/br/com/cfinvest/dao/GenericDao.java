package br.com.cfinvest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GenericDao<T>{

	private EntityManagerFactory emf;
	private EntityManager em;


	public void create(T obj) {
		emf = Persistence.createEntityManagerFactory("cfinvestPU");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}


	public void update(T obj) {
		emf = Persistence.createEntityManagerFactory("cfinvestPU");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}


	public T readById(Class<T> clazz, Long id){
		emf = Persistence.createEntityManagerFactory("cfinvestPU");
		em = emf.createEntityManager();
		T obj = em.find(clazz, id);
		em.close();
		emf.close();
		return obj;
	}


	public void delete(Class<T> clazz, Long id) {

		emf = Persistence.createEntityManagerFactory("cfinvestPU");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.getReference(clazz, id));
		em.getTransaction().commit();
		em.close();
		emf.close();

	}


	@SuppressWarnings("unchecked")
	public List<T> readAll(String tabela) {
		emf = Persistence.createEntityManagerFactory("cfinvestPU");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("FROM "+tabela);
		List<T> lista = query.getResultList();
		em.getTransaction().commit();
		em.close();
		emf.close();
		return lista;
	}

}
