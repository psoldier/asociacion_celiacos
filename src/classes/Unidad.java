package classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table (name="unidades")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_unidad")
public class Unidad extends ObjetoPersistente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)  
	private String nombre;
	
	@Column(name="direccion")  
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="email")  
	private String email;
	
	@OneToMany(mappedBy="unidad")
	private List<Usuario> usuarios;
	
	@ManyToMany
	@JoinTable(name="unidades_tipo_cuotas",
		joinColumns=@JoinColumn(name="unidad_id",
		referencedColumnName="id"),
		inverseJoinColumns=@JoinColumn(name="tipo_cuota_id",
		referencedColumnName="id")
	)
	private List<TipoCuota> tipo_cuotas;

	@ManyToOne(optional=false)
	@JoinColumn(name="tipo_unidad_id")
	private TipoUnidad tipo_unidad;
	
	
	
	public Unidad() {}
	
	
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
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<TipoCuota> getTipo_cuotas() {
		return tipo_cuotas;
	}
	public void setTipo_cuotas(List<TipoCuota> tipo_cuotas) {
		this.tipo_cuotas = tipo_cuotas;
	}
	public TipoUnidad getTipo_unidad() {
		return tipo_unidad;
	}
	public void setTipo_unidad(TipoUnidad tipo_unidad) {
		this.tipo_unidad = tipo_unidad;
	}

}
