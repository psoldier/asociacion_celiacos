package servicios;


import classes.Socio;
import dao.DaoJpaGenerico;



public class SociosService {
	DaoJpaGenerico<Socio> dao = new DaoJpaGenerico<Socio>(Socio.class);
	
	public boolean eliminar(int id){
		System.out.println("El id a eliminar es: " + id);
		dao.eliminarPorId(id);
		return true;
	}
	
	public boolean modificar(Socio s){
		System.out.println("El id a editar es: " + s.getId());
		dao.actualizar(s);
		
		return true;
	}

}
