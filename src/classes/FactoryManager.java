package classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoryManager {
	private static EntityManager em;  
	private FactoryManager() {  
	 }  	 
	 public static EntityManager getInstance() {
		 if (em == null) {
			 EntityManagerFactory emf =  Persistence.createEntityManagerFactory("asociacion_celiacos");
			 em = emf.createEntityManager();
		 }
		 return em;
	 }
}
