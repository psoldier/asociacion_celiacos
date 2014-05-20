package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import servicios.DelegacionService;
import classes.Delegacion;

@ManagedBean(name = "delegacionBean")
@SessionScoped
public class DelegacionBean {
	private long id;
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void clear(){
		this.setNombre(null);
		this.setDireccion(null);
		this.setEmail(null);
		this.setTelefono(null);
	}
	
	public List<Delegacion> getDelegaciones(){
		DelegacionService servicio = new DelegacionService();		
		return servicio.getListaDelegaciones();
	}
	
	public String editarDelegacion(Delegacion delegacion) {
		this.setId(delegacion.getId());
		this.setNombre(delegacion.getNombre());
		this.setDireccion(delegacion.getDireccion());
		this.setEmail(delegacion.getEmail());
		this.setTelefono(delegacion.getTelefono());
		
		return "editardelegacion";
	}
	
	public String editar(){
		DelegacionService servicio = new DelegacionService();	
		servicio.editarDelegacion(id, nombre, direccion, email, telefono);
		return "delegacion_editado";
	}
	public String eliminar(Delegacion delegacion){
		DelegacionService servicio = new DelegacionService();		
		servicio.eliminar(delegacion);
		return "delegacioneliminado";
	}
	
	public String creardelegacion(){
		DelegacionService servicio = new DelegacionService();	
		servicio.crearDelegacion(nombre, direccion, email, telefono);
		return "delegacion_creado";
	}
}
