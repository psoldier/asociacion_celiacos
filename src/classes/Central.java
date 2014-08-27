package classes;

import javax.persistence.*;


@Entity
@DiscriminatorValue("Central")
public class Central extends Unidad {
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne(optional = false)
	@JoinColumn(name="cuenta_id",nullable = false)
	private Cuenta cuenta;

	
	public Central() {}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
}
