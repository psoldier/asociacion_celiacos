package classes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="cutas")
public class Cuota extends ObjetoPersistente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)	
	private Float monto;
	
	@Column(nullable=false)	
	private Date fecha;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipo_cuota_id")
	private TipoCuota tipo_cuota;
	
	@OneToMany(mappedBy="cuota")
	private List<Movimiento> movimientos;
	
	
	
	
	public Cuota() {}
	
	
	
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public TipoCuota getTipo_cuota() {
		return tipo_cuota;
	}
	public void setTipo_cuota(TipoCuota tipo_cuota) {
		this.tipo_cuota = tipo_cuota;
	}
	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
	
}
