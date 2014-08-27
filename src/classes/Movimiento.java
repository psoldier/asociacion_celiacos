package classes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name="movimientos")
public class Movimiento extends ObjetoPersistente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="debe_id")
	private Cuenta debe;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="haber_id")
	private Cuenta haber;
	
	@Column(nullable=false)
	private Float monto;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="cuota_id")
	private Cuota cuota;
	
	@Column(nullable=false)
	private Date fecha;
	
	@Column(nullable=false)
	private String concepto;
	
	
	
	
	
	
	public Movimiento() {}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	public Cuenta getDebe() {
		return debe;
	}
	public void setDebe(Cuenta debe) {
		this.debe = debe;
	}
	public Cuenta getHaber() {
		return haber;
	}
	public void setHaber(Cuenta haber) {
		this.haber = haber;
	}
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	public Cuota getCuota() {
		return cuota;
	}
	public void setCuota(Cuota cuota) {
		this.cuota = cuota;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	
	
}
