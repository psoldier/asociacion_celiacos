package servicios;

import java.util.List;

import classes.GrupoDeReferencia;
import dao.DaoJpaGenerico;
import dao.GrupoDeReferenciaDaoImpl;

public class GrupoDeReferenciaService {

	public List<GrupoDeReferencia> getListaGrupoDeReferencias() {				
		GrupoDeReferenciaDaoImpl dao = new GrupoDeReferenciaDaoImpl(GrupoDeReferencia.class);
		
		return dao.listaGrupoDeReferencia();
	}
	
	public void crearGrupoDeReferencia(String nombre, String direccion, String email, String telefono){
		GrupoDeReferencia gdr = new GrupoDeReferencia();
		gdr.setNombre(nombre);
		gdr.setDireccion(direccion);
		gdr.setEmail(email);
		gdr.setTelefono(telefono);
		
		DaoJpaGenerico<GrupoDeReferencia> dao_gdr = new DaoJpaGenerico<GrupoDeReferencia>(GrupoDeReferencia.class);
		dao_gdr.guardar(gdr);
	}
	
	public void eliminar(GrupoDeReferencia gdr){
		DaoJpaGenerico<GrupoDeReferencia> dao_gdr = new DaoJpaGenerico<GrupoDeReferencia>(GrupoDeReferencia.class);
		dao_gdr.borrar(gdr);
	}
	
	public void editarGrupoDeReferencia(Long id, String nombre, String direccion, String email, String telefono){
		DaoJpaGenerico<GrupoDeReferencia> dao_gdr = new DaoJpaGenerico<GrupoDeReferencia>(GrupoDeReferencia.class);
		Object gdr = dao_gdr.buscar(id);
		((GrupoDeReferencia)gdr).setNombre(nombre);
		((GrupoDeReferencia)gdr).setDireccion(direccion);
		((GrupoDeReferencia)gdr).setEmail(email);
		((GrupoDeReferencia)gdr).setTelefono(telefono);
		
		dao_gdr.actualizar(gdr);
	}
}
