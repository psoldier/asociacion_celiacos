package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import classes.TipoCuota;

public class TipoCuotaDaoImpl extends DAOGenericoJPA<TipoCuota> implements TipoCuotaDao {

	@Override
	public List<TipoCuota> listar() {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select tc from TipoCuota tc";
		@SuppressWarnings("unchecked")
		List<TipoCuota> list = (ArrayList<TipoCuota>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}

}
