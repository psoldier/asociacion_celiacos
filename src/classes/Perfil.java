package classes;

import javax.persistence.*;

@Entity
@Table (name="perfiles")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_perfil")
public class Perfil {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	
	public Perfil() {}
	
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
}
