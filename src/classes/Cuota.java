package classes;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="cutas")
public class Cuota {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
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
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
