package classes;

import java.util.Date;
import javax.persistence.*;
@Entity
@DiscriminatorValue("Socio")
public class Socio extends Perfil {
	
	
	@Column(name="numero_socio", nullable=false)
	private String numero_socio;
	
	@Column(name="dni", nullable=false)
	private String dni;
	
	@Column(name="fecha_ingreso", nullable=false)
	private Date fecha_ingreso;
	
	@Column(name="fecha_nacimiento", nullable=false)
	private Date fecha_nacimiento;
	
	@Column(name="fecha_diagnostico", nullable=false)
	private Date fecha_diagnostico;
	
	@Column(name="presentado_por", nullable=false)
	private String presentado_por;
	
	@Column(name="ocupacion", nullable=false)
	private String ocupacion;
	
	@Column(name="beneficio", nullable=false)
	private Boolean beneficio;
	
	@OneToOne(optional = false)
	@JoinColumn(name="cuenta_id")
	private Cuenta cuenta;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipo_cuota_id")
	private TipoCuota tipo_cuota;
	
	
	
	
	public Socio() {}
	
	public String getNumero_socio() {
		return numero_socio;
	}
	public void setNumero_socio(String numero_socio) {
		this.numero_socio = numero_socio;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Date getFecha_diagnostico() {
		return fecha_diagnostico;
	}
	public void setFecha_diagnostico(Date fecha_diagnostico) {
		this.fecha_diagnostico = fecha_diagnostico;
	}
	public String getPresentado_por() {
		return presentado_por;
	}
	public void setPresentado_por(String presentado_por) {
		this.presentado_por = presentado_por;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public Boolean getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(Boolean beneficio) {
		this.beneficio = beneficio;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public TipoCuota getTipo_cuota() {
		return tipo_cuota;
	}

	public void setTipo_cuota(TipoCuota tipo_cuota) {
		this.tipo_cuota = tipo_cuota;
	}
	
	
}
