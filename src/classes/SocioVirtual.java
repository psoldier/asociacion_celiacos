package classes;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue("SocioVirtual")
public class SocioVirtual extends Socio {
	
	@OneToMany(mappedBy="socio_virtual")
	private List<AvisoPago> avisos_pagos;

	public SocioVirtual() {}
	

	public List<AvisoPago> getAvisos_pagos() {
		return avisos_pagos;
	}

	public void setAvisos_pagos(List<AvisoPago> avisos_pagos) {
		this.avisos_pagos = avisos_pagos;
	}
}
