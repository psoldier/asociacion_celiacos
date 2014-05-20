package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import servicios.GrupoDeReferenciaService;
import classes.GrupoDeReferencia;

@ManagedBean(name = "grupoDeReferenciaBean")
@SessionScoped
public class GrupoDeReferenciaBean {
	private long id;
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void clear(){
		this.setNombre(null);
		this.setDireccion(null);
		this.setEmail(null);
		this.setTelefono(null);
	}
	
	public List<GrupoDeReferencia> getGrupoDeReferencias(){
		GrupoDeReferenciaService servicio = new GrupoDeReferenciaService();		
		return servicio.getListaGrupoDeReferencias();
	}
	
	public String editarGrupoDeReferencia(GrupoDeReferencia grupoDeReferencia) {
		this.setId(grupoDeReferencia.getId());
		this.setNombre(grupoDeReferencia.getNombre());
		this.setDireccion(grupoDeReferencia.getDireccion());
		this.setEmail(grupoDeReferencia.getEmail());
		this.setTelefono(grupoDeReferencia.getTelefono());
		
		return "editargrupoDeReferencia";
	}
	
	public String editar(){
		GrupoDeReferenciaService servicio = new GrupoDeReferenciaService();	
		servicio.editarGrupoDeReferencia(id, nombre, direccion, email, telefono);
		return "grupoDeReferencia_editado";
	}
	public String eliminar(GrupoDeReferencia grupoDeReferencia){
		GrupoDeReferenciaService servicio = new GrupoDeReferenciaService();		
		servicio.eliminar(grupoDeReferencia);
		return "grupoDeReferenciaeliminado";
	}
	
	public String creargrupoDeReferencia(){
		GrupoDeReferenciaService servicio = new GrupoDeReferenciaService();	
		servicio.crearGrupoDeReferencia(nombre, direccion, email, telefono);
		return "grupoDeReferencia_creado";
	}
}
