package daspect;

import java.lang.reflect.Field;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.aspectj.lang.reflect.MethodSignature;


public aspect TransactionalAspect {
	Object around(): execution(@Transactional * *(..)) {
	Object obj = null;
	
	MethodSignature methodSignature = (MethodSignature) thisJoinPoint.getSignature();

	Transactional annotation = methodSignature.getMethod().getAnnotation(Transactional.class);

	Object dao = thisJoinPoint.getTarget();


	EntityManagerFactory emf = Persistence.createEntityManagerFactory("asociacion_celiacos");
	EntityManager em = emf.createEntityManager();
	try {
		for (Field field : dao.getClass().getFields()) {
			if (field.getType().equals(javax.persistence.EntityManager.class)){
				field.set(dao, em);
			}			
		}
		
		if (annotation.readonly() == false) {
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		obj = proceed();
		etx.commit();
		em.close();
		} else {
			obj = proceed();
		}
	}catch(Exception ex)
	{
		System.out.println("#################------ NO EJECUTO --------##############");
	} 
	return obj;
	} 
	
}
