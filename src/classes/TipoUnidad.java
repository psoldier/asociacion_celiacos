package classes;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table (name="tipo_unidades")
public class TipoUnidad extends ObjetoPersistente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;

	public TipoUnidad() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
}
