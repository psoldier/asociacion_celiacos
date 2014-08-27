package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import servicios.FilialService;

import classes.Filial;

@ManagedBean(name = "filialBean")
@SessionScoped
public class FilialBean {
	private Integer id;
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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

	public List<Filial> getFiliales(){
		FilialService servicio = new FilialService();		
		return servicio.getListaFiliales();
	}
	
	public String editarFilial(Filial filial) {
		this.setId(filial.getId());
		this.setNombre(filial.getNombre());
		this.setDireccion(filial.getDireccion());
		this.setEmail(filial.getEmail());
		this.setTelefono(filial.getTelefono());
		
		return "editarfilial";
	}
	
	public String editar(){
		FilialService servicio = new FilialService();	
		servicio.editarFilial(id, nombre, direccion, email, telefono);
		return "filial_editado";
	}
	public String eliminar(Filial filial){
		FilialService servicio = new FilialService();		
		servicio.eliminar(filial);
		return "filialeliminado";
	}
	
	public String crearfilial(){
		FilialService servicio = new FilialService();	
		servicio.crearFilial(nombre, direccion, email, telefono);
		return "filial_creado";
	}
	
}
