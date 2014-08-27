package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import classes.GrupoDeReferencia;

public class GrupoDeReferenciaDaoImpl extends DAOGenericoJPA<GrupoDeReferencia> implements
GrupoDeReferenciaDao {

	@Override
	public List<GrupoDeReferencia> listar() {
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select g from GrupoDeReferencia g";
		@SuppressWarnings("unchecked")
		List<GrupoDeReferencia> list = (ArrayList<GrupoDeReferencia>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}
	
	
}
