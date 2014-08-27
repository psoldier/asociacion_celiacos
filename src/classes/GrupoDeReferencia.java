package classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("GrupoDeReferencia")
public class GrupoDeReferencia extends Unidad {
	
	private static final long serialVersionUID = 1L;
	
	public GrupoDeReferencia() {}

}
