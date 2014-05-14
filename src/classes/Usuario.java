package classes;

import java.util.List;
import javax.persistence.*;
@Entity
@Table (name="usuarios")
public class Usuario {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nombre", nullable=false)	
	private String nombre;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="apellido", nullable=false)
	private String apellido;
	
	@Column(name="domicilio")
	private String domicilio;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@ManyToMany
	@JoinTable(name="perfiles_usuarios",
	joinColumns=@JoinColumn(name="usuario",
	referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="perfil",
	referencedColumnName="id"))
	private List<Perfil> perfiles;

	@ManyToOne
	@JoinColumn(name="unidad_id", nullable = true)
	private Unidad unidad;
	
	
	public Usuario() {}
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Perfil> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}


	public Unidad getUnidad() {
		return unidad;
	}


	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	
}
