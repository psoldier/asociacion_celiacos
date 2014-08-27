package classes;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Producto")
public class Producto extends Item{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="rnpa", nullable=false)
	private String rnpa;
	
	@Column(name="rne", nullable=false)
	private String rne;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	
	
	public Producto() {}
	
	
	public String getRnpa() {
		return rnpa;
	}
	public void setRnpa(String rnpa) {
		this.rnpa = rnpa;
	}
	public String getRne() {
		return rne;
	}
	public void setRne(String rne) {
		this.rne = rne;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
}
