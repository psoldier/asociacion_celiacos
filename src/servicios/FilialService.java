package servicios;

import java.util.List;

import classes.Filial;
import dao.DaoJpaGenerico;
import dao.FilialDaoImpl;


public class FilialService {
	
	public List<Filial> getListaFiliales() {				
		FilialDaoImpl dao = new FilialDaoImpl(Filial.class);
		
		return dao.listaFilial();
	}
	
	public void crearFilial(String nombre, String direccion, String email, String telefono){
		Filial f = new Filial();
		f.setNombre(nombre);
		f.setDireccion(direccion);
		f.setEmail(email);
		f.setTelefono(telefono);
		
		DaoJpaGenerico<Filial> dao_filial = new DaoJpaGenerico<Filial>(Filial.class);
		dao_filial.guardar(f);
	}
	
	public void eliminar(Filial f){
		DaoJpaGenerico<Filial> dao_filial = new DaoJpaGenerico<Filial>(Filial.class);
		dao_filial.borrar(f);
	}
	
	public void editarFilial(Long id, String nombre, String direccion, String email, String telefono){
		DaoJpaGenerico<Filial> dao_filial = new DaoJpaGenerico<Filial>(Filial.class);
		Object f = dao_filial.buscar(id);
		((Filial)f).setNombre(nombre);
		((Filial)f).setDireccion(direccion);
		((Filial)f).setEmail(email);
		((Filial)f).setTelefono(telefono);
		
		dao_filial.actualizar(f);
	}
}
