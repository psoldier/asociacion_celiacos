package servicios;

import java.util.List;

import classes.Usuario;
import dao.DaoJpaGenerico;
import dao.UsuarioDaoImpl;


public class OperadorCentralService {
	
	public List<Usuario> getListaOperadoresCentrales() {				
		UsuarioDaoImpl dao = new UsuarioDaoImpl(Usuario.class);
		
		return dao.listaOperadorCentral();
	}
	
	public void crearOperadorCentral(String nombre, String apellido, String password, String email, String telefono, String domicilio){
		Usuario u = new Usuario();
		u.setNombre(nombre);
		u.setApellido(apellido);
		u.setPassword(password);
		u.setEmail(email);
		u.setTelefono(telefono);
		u.setDomicilio(domicilio);
		
		DaoJpaGenerico<Usuario> dao_usuario = new DaoJpaGenerico<Usuario>(Usuario.class);
		dao_usuario.guardar(u);
	}
	
	public void eliminar(Usuario u){
		DaoJpaGenerico<Usuario> dao_usuario = new DaoJpaGenerico<Usuario>(Usuario.class);
		dao_usuario.borrar(u);
	}
	
	public void editarOperadorCentral(Long id, String nombre, String apellido, String telefono, String domicilio){
		DaoJpaGenerico<Usuario> dao_usuario = new DaoJpaGenerico<Usuario>(Usuario.class);
		Object u = dao_usuario.buscar(id);
		((Usuario)u).setNombre(nombre);
		((Usuario)u).setApellido(apellido);
		((Usuario)u).setTelefono(telefono);
		((Usuario)u).setDomicilio(domicilio);
		
		dao_usuario.actualizar(u);
	}
}
