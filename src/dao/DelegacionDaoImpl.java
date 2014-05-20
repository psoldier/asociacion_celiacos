package dao;

import java.util.List;

import javax.persistence.Query;

import classes.Delegacion;

public class DelegacionDaoImpl extends DaoJpaGenerico<Delegacion> implements DelegacionDao{

	public DelegacionDaoImpl(Class<?> tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	public List<Delegacion> listaDelegacion() {

		//Falta agregar al query q sea por tipo operadorCentral
		Query query = this.getEntityManager().createQuery("FROM Delegacion");
		return query.getResultList();
	}
}
