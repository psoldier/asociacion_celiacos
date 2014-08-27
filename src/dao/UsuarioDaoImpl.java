package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import classes.Usuario;

public class UsuarioDaoImpl extends DAOGenericoJPA<Usuario> implements
		UsuarioDao {

	private EntityManager em=getEntityManagerFactory().createEntityManager();
	@Override
	public List<Usuario> listar() {
		String query = "select u from Usuario u";
		@SuppressWarnings("unchecked")
		List<Usuario> list = (ArrayList<Usuario>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}
	
	public Usuario getUser(String email, String password) {
		String sql = "select u FROM Usuario u where u.email= :email AND u.password = :password";
		Query query = em.createQuery(sql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<Usuario> users = (ArrayList<Usuario>)query.getResultList();
		if (users != null && users.size() == 1) {
			return users.get(0);
		}
		return null;
	}
 
	public Usuario getUser(String email) {
		String sql = "SELECT u FROM usuarios u WHERE u.email = :email";
		Query query = em.createQuery(sql);
		query.setParameter("email", email);
		@SuppressWarnings("unchecked")
		List<Usuario> users = (ArrayList<Usuario>)query.getResultList();
		if (users.isEmpty()) {
			return null;
		}
		return users.get(0);
	}

}
