package servicios;

import java.util.List;

import classes.Delegacion;
import dao.DelegacionDaoImpl;

public class DelegacionService {
	DelegacionDaoImpl dao = new DelegacionDaoImpl();
	public List<Delegacion> getListaDelegaciones() {				
		return dao.listar();
	}
	
	public void crearDelegacion(String nombre, String direccion, String email, String telefono){
		Delegacion d = new Delegacion();
		d.setNombre(nombre);
		d.setDireccion(direccion);
		d.setEmail(email);
		d.setTelefono(telefono);
		
		dao.guardar(d);
	}
	
	public void eliminar(Delegacion d){
		dao.borrar(d);
	}
	
	public void editarDelegacion(Long id, String nombre, String direccion, String email, String telefono){
		Delegacion d = dao.buscar(id);
		d.setNombre(nombre);
		d.setDireccion(direccion);
		d.setEmail(email);
		d.setTelefono(telefono);
		
		dao.actualizar(d);
	}
}
