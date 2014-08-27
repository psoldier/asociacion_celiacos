package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import classes.Filial;

public class FilialDaoImpl extends DAOGenericoJPA<Filial> implements FilialDao {

	@Override
	public List<Filial> listar() {
		
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select f from Filial f";
		@SuppressWarnings("unchecked")
		List<Filial> list = (ArrayList<Filial>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}

}
