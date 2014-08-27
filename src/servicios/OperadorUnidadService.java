package servicios;

import java.util.List;

import classes.Usuario;
import dao.UsuarioDaoImpl;


public class OperadorUnidadService {
	UsuarioDaoImpl dao = new UsuarioDaoImpl();
	
	public List<Usuario> getListaOperadoresUnidades() {				
		
		
		return dao.listar();
	}
	
	public void crearOperadorUnidad(String nombre, String apellido, String password, String email, String telefono, String domicilio){
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
	
	public void editarOperadorUnidad(Long id, String nombre, String apellido, String telefono, String domicilio){
		Usuario u = dao.buscar(id);
		u.setNombre(nombre);
		u.setApellido(apellido);
		u.setTelefono(telefono);
		u.setDomicilio(domicilio);
		
		dao.actualizar(u);
	}
}
