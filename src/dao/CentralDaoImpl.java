package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import classes.Central;

public class CentralDaoImpl extends DAOGenericoJPA<Central> implements CentralDao{

	@Override
	public List<Central> listar() {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select c from Central c";
		@SuppressWarnings("unchecked")
		List<Central> list = (ArrayList<Central>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}

}
