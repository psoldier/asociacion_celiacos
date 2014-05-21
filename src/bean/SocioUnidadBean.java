package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import servicios.OperadorUnidadService;
import classes.Usuario;

@ManagedBean(name = "socioUnidadBean")
@SessionScoped
public class SocioUnidadBean {
	private long id;
	private String nro_socio;
	private String apellido;
	private String nombre;
	private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNro_socio() {
		return nro_socio;
	}
	public void setNro_socio(String nro_socio) {
		this.nro_socio = nro_socio;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Usuario> getSociosUnidad(){
		OperadorUnidadService servicio = new OperadorUnidadService();
		return servicio.getListaOperadoresUnidades();
		//SocioUnidadService servicio = new SocioUnidadService();		
		//return servicio.getListaSocioUnidades();
	}
	
	public String editarSocio(Usuario socio) {
		this.setId(socio.getId());
		//this.setNro_socio(socio.getNombre());
		this.setApellido(socio.getApellido());
		this.setNombre(socio.getNombre());
		this.setEmail(socio.getEmail());
		
		
		return "ou_editarsocio";
	}
	
	public String editar(){
		//SocioUnidadService servicio = new SocioUnidadService();	
		//servicio.editarSocioUnidad(id, nombre, apellido, telefono, domicilio);
		return "socio_unidad_editado";
	}
	public String eliminar(Usuario socio){
		//SocioUnidadService servicio = new SocioUnidadService();		
		//servicio.eliminar(socio);
		return "ou_usuarioeliminado";
	}
	
	public String crearSocio(){
		//OperadorUnidadService servicio = new OperadorUnidadService();	
		//servicio.crearOperadorUnidad(nombre, apellido, password, email, telefono, domicilio);
		return "operador_unidad_creado";
	}
	
}
