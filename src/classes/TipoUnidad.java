package classes;

import javax.persistence.*;
@Entity
@Table (name="tipo_unidades")
public class TipoUnidad {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;

	
	
	
	public TipoUnidad() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Long getId() {
		return Id;
	}
}
