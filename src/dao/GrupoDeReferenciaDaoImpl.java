package dao;

import java.util.List;

import javax.persistence.Query;

import classes.GrupoDeReferencia;

public class GrupoDeReferenciaDaoImpl extends DaoJpaGenerico<GrupoDeReferencia> implements
GrupoDeReferenciaDao {
	
	public GrupoDeReferenciaDaoImpl(Class<?> tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	public List<GrupoDeReferencia> listaGrupoDeReferencia() {

		//Falta agregar al query q sea por tipo operadorCentral
		Query query = this.getEntityManager().createQuery("FROM GrupoDeReferencia");
		return query.getResultList();
	}
}
