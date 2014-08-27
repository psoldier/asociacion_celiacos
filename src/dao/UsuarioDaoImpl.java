package dao;

import java.util.List;

import javax.persistence.Query;

import classes.Usuario;

public class UsuarioDaoImpl extends DaoJpaGenerico<Usuario> implements
		UsuarioDao {

	public UsuarioDaoImpl() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

	
	public Usuario getUser(String email, String password) {
		String sql = "select u FROM Usuario u where u.email= :email AND u.password = :password";
		Query query = entityManager.createQuery(sql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		List<Usuario> users = query.getResultList();
		if (users != null && users.size() == 1) {
			return users.get(0);
		}
		return null;
	}
 
	public Usuario getUser(String email) {
		String sql = "SELECT u FROM usuarios u WHERE u.email = :email";
		Query query = entityManager.createQuery(sql);
		query.setParameter("email", email);
		query.getResultList();
		List<Usuario> l = query.getResultList();
		if (l.isEmpty()) {
			return null;
		}
		return l.get(0);
	}
	
	
}
