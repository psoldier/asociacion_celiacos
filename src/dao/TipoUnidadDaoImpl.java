package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import classes.TipoUnidad;

public class TipoUnidadDaoImpl extends DAOGenericoJPA<TipoUnidad> implements
TipoUnidadDao {

	@Override
	public List<TipoUnidad> listar() {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select tu from TipoUnidad tu";
		@SuppressWarnings("unchecked")
		List<TipoUnidad> list = (ArrayList<TipoUnidad>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}
	
	
}