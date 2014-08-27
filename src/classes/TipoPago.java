package classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
@Table (name="tipos_pagos")
public class TipoPago extends ObjetoPersistente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="nombre", nullable=false)
    private String nombre;

	@OneToMany(mappedBy="tipo_pago")
	private List<AvisoPago> avisos_pagos;
	
	public TipoPago() {	}
	
	public List<AvisoPago> getAvisos_pagos() {
		return avisos_pagos;
	}

	public void setAvisos_pagos(List<AvisoPago> avisos_pagos) {
		this.avisos_pagos = avisos_pagos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
}
