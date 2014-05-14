package dao;

import java.util.List;

import javax.persistence.Query;

import classes.Filial;

public class FilialDaoImpl extends DaoJpaGenerico<Filial> implements
FilialDao {

	public FilialDaoImpl(Class<?> tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	
	public List<Filial> listaFilial() {

		//Falta agregar al query q sea por tipo operadorCentral
		Query query = this.getEntityManager().createQuery("FROM Filial");
		return query.getResultList();
	}
	

}
