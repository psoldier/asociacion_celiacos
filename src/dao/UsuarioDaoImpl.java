package dao;

import java.util.List;

import javax.persistence.Query;

import classes.Usuario;

public class UsuarioDaoImpl extends DaoJpaGenerico<Usuario> implements
		UsuarioDao {

	public UsuarioDaoImpl(Class<?> tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	public Usuario buscarUsuario(String email, String password) {

		Query query = this.getEntityManager().createQuery("select u FROM Usuario u where u.email= :email AND u.password = :password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		List<Usuario> users = query.getResultList();
		if (users != null && users.size() == 1) {
			return users.get(0);
		}
		return null;
	}

	public List<Usuario> listaOperadorCentral() {

		//Falta agregar al query q sea por tipo operadorCentral
		Query query = this.getEntityManager().createQuery("FROM Usuario");
		return query.getResultList();
	}
	
	public List<Usuario> listaOperadorUnidad() {

		//Falta agregar al query q sea por tipo operadorUnidad
		Query query = this.getEntityManager().createQuery("FROM Usuario");
		return query.getResultList();
	}
	

}
