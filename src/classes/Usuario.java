package classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="usuarios")
public class Usuario extends ObjetoPersistente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
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
