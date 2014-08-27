package classes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name="avisos_pagos")
public class AvisoPago extends ObjetoPersistente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)		
	private Date fecha;
	
	@Column(nullable=false)	
	private Float monto;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipo_pago_id")
	private TipoPago tipo_pago;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="socio_virtual_id")
	private SocioVirtual socio_virtual;
	

	
	
	public AvisoPago() {}

	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	public TipoPago getTipo_pago() {
		return tipo_pago;
	}
	public void setTipo_pago(TipoPago tipo_pago) {
		this.tipo_pago = tipo_pago;
	}
	public SocioVirtual getSocio_virtual() {
		return socio_virtual;
	}
	public void setSocio_virtual(SocioVirtual socio_virtual) {
		this.socio_virtual = socio_virtual;
	}
}
