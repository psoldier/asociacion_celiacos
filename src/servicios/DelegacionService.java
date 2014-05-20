package servicios;

import java.util.List;

import classes.Delegacion;
import dao.DaoJpaGenerico;
import dao.DelegacionDaoImpl;

public class DelegacionService {

	public List<Delegacion> getListaDelegaciones() {				
		DelegacionDaoImpl dao = new DelegacionDaoImpl(Delegacion.class);
		
		return dao.listaDelegacion();
	}
	
	public void crearDelegacion(String nombre, String direccion, String email, String telefono){
		Delegacion d = new Delegacion();
		d.setNombre(nombre);
		d.setDireccion(direccion);
		d.setEmail(email);
		d.setTelefono(telefono);
		
		DaoJpaGenerico<Delegacion> dao_delegacion = new DaoJpaGenerico<Delegacion>(Delegacion.class);
		dao_delegacion.guardar(d);
	}
	
	public void eliminar(Delegacion d){
		DaoJpaGenerico<Delegacion> dao_delegacion = new DaoJpaGenerico<Delegacion>(Delegacion.class);
		dao_delegacion.borrar(d);
	}
	
	public void editarDelegacion(Long id, String nombre, String direccion, String email, String telefono){
		DaoJpaGenerico<Delegacion> dao_delegacion = new DaoJpaGenerico<Delegacion>(Delegacion.class);
		Object d = dao_delegacion.buscar(id);
		((Delegacion)d).setNombre(nombre);
		((Delegacion)d).setDireccion(direccion);
		((Delegacion)d).setEmail(email);
		((Delegacion)d).setTelefono(telefono);
		
		dao_delegacion.actualizar(d);
	}
}
