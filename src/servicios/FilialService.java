package servicios;

import java.util.List;

import classes.Filial;
import dao.DaosFactory;
import dao.FilialDao;


public class FilialService {
	FilialDao dao = DaosFactory.getFilialDAO();
	public FilialDao getDao() {
		return dao;
	}
	
	public List<Filial> getListaFiliales() {				
		return this.getDao().listar();
	}
	
	public void crearFilial(String nombre, String direccion, String email, String telefono){
		Filial f = new Filial();
		f.setNombre(nombre);
		f.setDireccion(direccion);
		f.setEmail(email);
		f.setTelefono(telefono);
		
		this.getDao().guardar(f);
	}
	
	public void eliminar(Filial f){
		this.getDao().borrar(f);
	}
	
	public void editarFilial(Integer id, String nombre, String direccion, String email, String telefono){
		Filial f = this.getDao().buscar(Filial.class, id);
		f.setNombre(nombre);
		f.setDireccion(direccion);
		f.setEmail(email);
		f.setTelefono(telefono);
		
		this.getDao().actualizar(f);
	}
}
