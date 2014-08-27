package classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Delegacion")
public class Delegacion extends Unidad {
	
	private static final long serialVersionUID = 1L;
	
	public Delegacion() {}

}