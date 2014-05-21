package dao;

import javax.persistence.*;
import daspect.Transactional;

public class DaoJpaGenerico<T> implements DaoGenerico<T> {

	private Class<?> tipo;
	private static EntityManager entityManager; 
	
	

	public DaoJpaGenerico(Class<?> tipo) {
            this.tipo = tipo;   
	}
	
	public EntityManager setEntityManager(EntityManager em){
		this.entityManager = em;
		return em;
	}
	
	public static EntityManager getEntityManager(){
		if (entityManager == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("asociacion_celiacos");
			entityManager = emf.createEntityManager();
		}
		return entityManager;
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
