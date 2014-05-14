package classes;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="cuentas")
public class Cuenta {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy="debe")
	private List<Movimiento> debe;
	
	@OneToMany(mappedBy="haber")
	private List<Movimiento> haber;
	
	
	public Cuenta() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public List<Movimiento> getDebe() {
		return debe;
	}
	public void setDebe(List<Movimiento> debe) {
		this.debe = debe;
	}
	public List<Movimiento> getHaber() {
		return haber;
	}
	public void setHaber(List<Movimiento> haber) {
		this.haber = haber;
	}
	
}
