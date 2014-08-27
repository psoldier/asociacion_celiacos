package servicios;

import java.util.List;

import classes.Usuario;
import dao.DaosFactory;
import dao.UsuarioDao;


public class OperadorUnidadService {
	UsuarioDao dao = DaosFactory.getUsuarioDAO();
	public UsuarioDao getDao() {
		return dao;
	}
	
	public List<Usuario> getListaOperadoresUnidades() {				
		return this.getDao().listar();
	}
	
	public void crearOperadorUnidad(String nombre, String apellido, String password, String email, String telefono, String domicilio){
		Usuario u = new Usuario();
		u.setNombre(nombre);
		u.setApellido(apellido);
		u.setPassword(password);
		u.setEmail(email);
		u.setTelefono(telefono);
		u.setDomicilio(domicilio);
		
		this.getDao().guardar(u);
	}
	
	public void eliminar(Usuario u){
		this.getDao().borrar(u);
	}
	
	public void editarOperadorUnidad(Integer id, String nombre, String apellido, String telefono, String domicilio){
		Usuario u = this.getDao().buscar(Usuario.class, id);
		u.setNombre(nombre);
		u.setApellido(apellido);
		u.setTelefono(telefono);
		u.setDomicilio(domicilio);
		
		this.getDao().actualizar(u);
	}
}
