package servicios;

import java.util.List;

import classes.Usuario;
import dao.UsuarioDaoImpl;


public class OperadorCentralService {
	UsuarioDaoImpl dao = new UsuarioDaoImpl();
	
	public List<Usuario> getListaOperadoresCentrales() {				
		return dao.listar();
	}
	
	public void crearOperadorCentral(String nombre, String apellido, String password, String email, String telefono, String domicilio){
		Usuario u = new Usuario();
		u.setNombre(nombre);
		u.setApellido(apellido);
		u.setPassword(password);
		u.setEmail(email);
		u.setTelefono(telefono);
		u.setDomicilio(domicilio);
		
		dao.guardar(u);
	}
	
	public void eliminar(Usuario u){
		dao.borrar(u);
	}
	
	public Usuario editarOperadorCentral(Long id, String nombre, String apellido, String email, String password, String telefono, String domicilio){
		Usuario u = dao.buscar(id);
		u.setNombre(nombre);
		u.setApellido(apellido);
		u.setPassword(password);
		u.setEmail(email);
		u.setTelefono(telefono);
		u.setDomicilio(domicilio);
		
		return dao.actualizar(u);
		
	}
}
