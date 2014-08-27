package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import classes.Cuenta;

public class CuentaDaoImpl extends DAOGenericoJPA<Cuenta> implements CuentaDao {

	@Override
	public List<Cuenta> listar() {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select c from Cuenta c";
		@SuppressWarnings("unchecked")
		List<Cuenta> list = (ArrayList<Cuenta>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}

}
