package servicios;

import java.util.List;

import classes.GrupoDeReferencia;
import dao.DaosFactory;
import dao.GrupoDeReferenciaDao;

public class GrupoDeReferenciaService {
	GrupoDeReferenciaDao dao = DaosFactory.getGrupoDeReferenciaDao();
	public GrupoDeReferenciaDao getDao() {
		return dao;
	}
	
	public List<GrupoDeReferencia> getListaGrupoDeReferencias() {				
		return this.getDao().listar();
	}
	
	public void crearGrupoDeReferencia(String nombre, String direccion, String email, String telefono){
		GrupoDeReferencia gdr = new GrupoDeReferencia();
		gdr.setNombre(nombre);
		gdr.setDireccion(direccion);
		gdr.setEmail(email);
		gdr.setTelefono(telefono);
		
		this.getDao().guardar(gdr);
	}
	
	public void eliminar(GrupoDeReferencia gdr){
		this.getDao().borrar(gdr);
	}
	
	public void editarGrupoDeReferencia(Integer id, String nombre, String direccion, String email, String telefono){
		GrupoDeReferencia gdr = this.getDao().buscar(GrupoDeReferencia.class, id);
		gdr.setNombre(nombre);
		gdr.setDireccion(direccion);
		gdr.setEmail(email);
		gdr.setTelefono(telefono);
		
		this.getDao().actualizar(gdr);
	}
}
