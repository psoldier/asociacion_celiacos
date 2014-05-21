package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import servicios.OperadorUnidadService;
import classes.Usuario;

@ManagedBean(name = "operadorUnidadBean")
@SessionScoped
public class OperadorUnidadBean {
	private long id;
	private String email;
	private String password;
	private String nombre;
	private String apellido;
	private String telefono;
	private String domicilio;
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public void clear(){
		this.setApellido(null);
		this.setEmail(null);
		this.setPassword(null);
		this.setTelefono(null);
		this.setDomicilio(null);
		this.setNombre(null);
	}

	public List<Usuario> getOperadoresUnidad(){
		OperadorUnidadService servicio = new OperadorUnidadService();		
		return servicio.getListaOperadoresUnidades();
	}
	
	public String editarOperador(Usuario operador) {
		this.setId(operador.getId());
		this.setApellido(operador.getApellido());
		this.setEmail(operador.getEmail());
		this.setPassword(operador.getPassword());
		this.setTelefono(operador.getTelefono());
		this.setDomicilio(operador.getDomicilio());
		this.setNombre(operador.getNombre());
		return "ou_editaroperador";
	}
	
	public String editar(){
		OperadorUnidadService servicio = new OperadorUnidadService();	
		servicio.editarOperadorUnidad(id, nombre, apellido, telefono, domicilio);
		return "operador_unidad_editado";
	}
	public String eliminar(Usuario operador){
		OperadorUnidadService servicio = new OperadorUnidadService();		
		servicio.eliminar(operador);
		return "ou_usuarioeliminado";
	}
	
	public String crearOperador(){
		OperadorUnidadService servicio = new OperadorUnidadService();	
		servicio.crearOperadorUnidad(nombre, apellido, password, email, telefono, domicilio);
		return "operador_unidad_creado";
	}
	
	

}
