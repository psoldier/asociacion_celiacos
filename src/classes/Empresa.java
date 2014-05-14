package classes;

import java.util.List;
import javax.persistence.*;
@Entity
@Table (name="empresas")
public class Empresa {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@OneToMany(mappedBy="empresa")
	private List<Producto> productos;
	
	
	
	
	
	public Empresa() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
