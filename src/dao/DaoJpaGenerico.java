package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import classes.FactoryManager;
import daspect.Transactional;

public class DaoJpaGenerico<T> implements DaoGenerico<T> {
	
	private Class<T> persistenceClass = null;
	public EntityManager entityManager = this.getEntityManager();
	public EntityTransaction tx;
	
	public DaoJpaGenerico(Class clase) {
        this.persistenceClass = clase;
        
    }
	
	private EntityManager getEntityManager() {
		return FactoryManager.getInstance();
	}
	
    @Transactional(readonly=true) 
    public List<T> listar() {
        CriteriaQuery criteriaQuery = entityManager.getCriteriaBuilder().createQuery(persistenceClass);
        criteriaQuery.from(persistenceClass);
        TypedQuery typedQuery = entityManager.createQuery(criteriaQuery);
        List l = typedQuery.getResultList();
        return l;
    }
    
    @Transactional(readonly=false) 
	public void guardar(T objeto) {
        entityManager.persist(objeto);
	}

    @Transactional(readonly=false) 
	public void borrar(T objeto) {
        entityManager.remove(objeto);
        }
  
    @Transactional(readonly=true) 
    public T buscar(Long id) {
        T tipo = (T) entityManager.find(persistenceClass, id);
        return tipo;
    }
    
    @Transactional(readonly=false) 
    public T actualizar(T objeto) {
        T tipo = (T) entityManager.merge(objeto);
        return tipo;
    }
    
    @Transactional(readonly=false) 
	public void eliminarPorId(Object id) {
		entityManager.remove(this.entityManager.getReference(persistenceClass, id));
		
	}
}
