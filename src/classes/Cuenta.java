package classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="cuentas")
public class Cuenta extends ObjetoPersistente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@OneToMany(mappedBy="debe")
	private List<Movimiento> debe;
	
	@OneToMany(mappedBy="haber")
	private List<Movimiento> haber;
	
	
	public Cuenta() {}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
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
