package classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Delegacion")
public class Delegacion extends Unidad {
	
	public Delegacion() {}

}