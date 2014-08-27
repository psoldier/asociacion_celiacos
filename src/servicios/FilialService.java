package servicios;

import java.util.List;

import classes.Filial;
import dao.FilialDaoImpl;


public class FilialService {
	FilialDaoImpl dao = new FilialDaoImpl();
	
	public List<Filial> getListaFiliales() {				
		return dao.listar();
	}
	
	public void crearFilial(String nombre, String direccion, String email, String telefono){
		Filial f = new Filial();
		f.setNombre(nombre);
		f.setDireccion(direccion);
		f.setEmail(email);
		f.setTelefono(telefono);
		
		dao.guardar(f);
	}
	
	public void eliminar(Filial f){
		dao.borrar(f);
	}
	
	public void editarFilial(Long id, String nombre, String direccion, String email, String telefono){
		Filial f = dao.buscar(id);
		f.setNombre(nombre);
		f.setDireccion(direccion);
		f.setEmail(email);
		f.setTelefono(telefono);
		
		dao.actualizar(f);
	}
}
