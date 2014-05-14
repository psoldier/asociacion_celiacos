package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
  

@ManagedBean(name="misDatosBean")
@SessionScoped
public class misDatosBean {
	private String nombre;
	private String apellido;
	private String email;
	private String domicilio;
	private String telefono;
	
	public String actualizar(){
		return "exito";
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
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	


}
