package dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import classes.Delegacion;

public class DelegacionDaoImpl extends DAOGenericoJPA<Delegacion> implements DelegacionDao{

	@Override
	public List<Delegacion> listar() {
		
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select d from Delegacion d";
		@SuppressWarnings("unchecked")
		List<Delegacion> list = (ArrayList<Delegacion>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}
}
