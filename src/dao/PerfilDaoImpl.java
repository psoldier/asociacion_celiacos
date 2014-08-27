package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import classes.Perfil;

public class PerfilDaoImpl extends DAOGenericoJPA<Perfil> implements PerfilDao {

	@Override
	public List<Perfil> listar() {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select p from Perfil p";
		@SuppressWarnings("unchecked")
		List<Perfil> list = (ArrayList<Perfil>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}

}
