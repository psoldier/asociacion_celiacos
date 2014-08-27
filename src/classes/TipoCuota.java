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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="tipo_cuotas")
public class TipoCuota extends ObjetoPersistente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private Boolean modificable;
	
	@OneToMany(mappedBy="tipo_cuota")
	private List<Cuota> cuotas;
	
	@ManyToMany
	@JoinTable(name="unidades_tipo_cuotas",
		joinColumns=@JoinColumn(name="tipo_cuota_id",
		referencedColumnName="id"),
		inverseJoinColumns=@JoinColumn(name="unidad_id",
		referencedColumnName="id")
	)
	private List<Unidad> unidades;
	
	@OneToMany(mappedBy="tipo_cuota")
	private List<Socio> socios;
	
	public TipoCuota() {}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getModificable() {
		return modificable;
	}
	public void setModificable(Boolean modificable) {
		this.modificable = modificable;
	}
	public List<Socio> getSocios() {
		return socios;
	}
	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}
	public List<Cuota> getCuotas() {
		return cuotas;
	}
	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	public List<Unidad> getUnidades() {
		return unidades;
	}
	public void setUnidades(List<Unidad> unidades) {
		this.unidades = unidades;
	}
}
