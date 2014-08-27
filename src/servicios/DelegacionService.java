package servicios;

import java.util.List;

import classes.Delegacion;
import dao.DaosFactory;
import dao.DelegacionDao;


public class DelegacionService {
	DelegacionDao dao = DaosFactory.getDelegacionDAO();
	
	public DelegacionDao getDao() {
		return dao;
	}
	
	public List<Delegacion> getListaDelegaciones() {				
		return this.getDao().listar();
	}
	
	public void crearDelegacion(String nombre, String direccion, String email, String telefono){
		Delegacion d = new Delegacion();
		d.setNombre(nombre);
		d.setDireccion(direccion);
		d.setEmail(email);
		d.setTelefono(telefono);
		
		this.getDao().guardar(d);
	}
	
	public void eliminar(Delegacion d){
		dao.borrar(d);
	}
	
	public void editarDelegacion(Integer id, String nombre, String direccion, String email, String telefono){
		Delegacion d = this.getDao().buscar(Delegacion.class,id);
		d.setNombre(nombre);
		d.setDireccion(direccion);
		d.setEmail(email);
		d.setTelefono(telefono);
		
		dao.actualizar(d);
	}
}
