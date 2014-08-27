package servicios;

import java.util.List;

import classes.GrupoDeReferencia;
import dao.GrupoDeReferenciaDaoImpl;

public class GrupoDeReferenciaService {
	GrupoDeReferenciaDaoImpl dao = new GrupoDeReferenciaDaoImpl();
	
	public List<GrupoDeReferencia> getListaGrupoDeReferencias() {				
		return dao.listar();
	}
	
	public void crearGrupoDeReferencia(String nombre, String direccion, String email, String telefono){
		GrupoDeReferencia gdr = new GrupoDeReferencia();
		gdr.setNombre(nombre);
		gdr.setDireccion(direccion);
		gdr.setEmail(email);
		gdr.setTelefono(telefono);
		
		dao.guardar(gdr);
	}
	
	public void eliminar(GrupoDeReferencia gdr){
		dao.borrar(gdr);
	}
	
	public void editarGrupoDeReferencia(Long id, String nombre, String direccion, String email, String telefono){
		GrupoDeReferencia gdr = dao.buscar(id);
		gdr.setNombre(nombre);
		gdr.setDireccion(direccion);
		gdr.setEmail(email);
		gdr.setTelefono(telefono);
		
		dao.actualizar(gdr);
	}
}
