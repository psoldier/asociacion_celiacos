package classes;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name="items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_item")
public class Item {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nombre", nullable=false)  
	private String nombre;
	
	@Column(name="caracteristicas")
	private String caracteristicas;
	
	@Column (name="fecha_alta", nullable=false) 
	private Date fecha_alta;
	
	@Column (name="fecha_certificado_ldg", nullable=false) 
	private Date fecha_certificado_ldg;
	
	@Column (name="fecha_diagnostico", nullable=false)
	private Date fecha_diagnostico;
	
	@Column (name="comentario")
	private String comentario;
	
	@Column (name="habilitado", nullable=false)
	private Boolean habilitado;
	
	@Column (name="visible", nullable=false)
	private Boolean visible;
	
	
	
	public Item() {}
	
	
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
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public Date getFecha_certificado_ldg() {
		return fecha_certificado_ldg;
	}
	public void setFecha_certificado_ldg(Date fecha_certificado_ldg) {
		this.fecha_certificado_ldg = fecha_certificado_ldg;
	}
	public Date getFecha_diagnostico() {
		return fecha_diagnostico;
	}
	public void setFecha_diagnostico(Date fecha_diagnostico) {
		this.fecha_diagnostico = fecha_diagnostico;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Boolean getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
}
