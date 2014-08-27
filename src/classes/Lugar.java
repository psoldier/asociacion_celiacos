package classes;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Lugar")
public class Lugar extends Item {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	
	public Lugar() {}
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
