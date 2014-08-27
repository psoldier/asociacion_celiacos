package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import classes.Socio;

public class SocioDaoImpl extends DAOGenericoJPA<Socio> implements SocioDao {

		@Override
		public List<Socio> listar() {
			EntityManager em=getEntityManagerFactory().createEntityManager();
			String query = "select s from Socio s";
			@SuppressWarnings("unchecked")
			List<Socio> list = (ArrayList<Socio>)(em.createQuery(query)).getResultList();
			em.close();
			return list;
		}

}
