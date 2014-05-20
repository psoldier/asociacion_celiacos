package classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("GrupoDeReferencia")
public class GrupoDeReferencia extends Unidad {
	
	public GrupoDeReferencia() {}

}
