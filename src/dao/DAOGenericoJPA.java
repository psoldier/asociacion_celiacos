package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import classes.ObjetoPersistente;


public abstract class DAOGenericoJPA<T> implements InterfaceDao<T> {
	
	private static EntityManagerFactory emf;
	public static EntityManagerFactory getEntityManagerFactory() {

		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("asociacion_celiacos");
		}
		return emf;
	}
	
	private Integer getId(ObjetoPersistente entity) {
		return entity.getId();
	}
	
	public void guardar(T entity) {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();

			em.persist(entity);

			tx.commit();
			em.close();
		} catch (Exception e) {
			tx.rollback();
		}

	}
	
	public void actualizar(T entity) {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();

			em.merge(entity);

			tx.commit();
			em.close();
		} catch (Exception e) {
			tx.rollback();
		}

	}
	
	public void borrar(T entity) {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();

			em.remove(em.getReference(entity.getClass(),
					this.getId((ObjetoPersistente) entity)));

			tx.commit();
			em.close();
		} catch (Exception e) {
			tx.rollback();
		}
	}
	
	public abstract List<T> listar();
	
	@SuppressWarnings("unchecked")
	public T buscar(Class<? extends ObjetoPersistente> nombreClase,
			Integer id) {
		T entity = null;
		EntityManager em=getEntityManagerFactory().createEntityManager();
		entity = (T) em.find(nombreClase, id);
		em.close();
		return entity;
	}
  
}
