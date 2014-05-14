package dao;

import javax.persistence.*;
import daspect.Transactional;

public class DaoJpaGenerico<T> implements DaoGenerico<T> {

	private Class<?> tipo;
	public EntityManager entityManager; 
	

	public DaoJpaGenerico(Class<?> tipo) {
            this.tipo = tipo;   
	}
	
	public EntityManager setEntityManager(EntityManager em){
		this.entityManager = em;
		return em;
	}
	
	public EntityManager getEntityManager(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("asociacion_celiacos");
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	@Override
	@Transactional(readonly=false)
    public void guardar(Object entity) {
		entityManager.persist(entity);
    }
    @Override
    @Transactional(readonly=false)
    public void borrar(Object entity) {
    	entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }
    @Override
    @Transactional(readonly=false)
    public void actualizar(Object entity) {

		entityManager.merge(entity);

    }

	@Override
	@Transactional(readonly=true)
	public Object buscar(Long id) {
		Object object = entityManager.find(tipo, id);
        return object;
	}


}
