package servicios;

import classes.Socio;
import dao.DaosFactory;
import dao.SocioDao;

public class SociosService {
	SocioDao dao = DaosFactory.getSocioDao();
	public SocioDao getDao() {
		return dao;
	}
	
	public void eliminar(Socio s){
		this.getDao().borrar(s);
	}
	//Debo obtener todos los params de Socio
	public void modificar(Socio s){
		this.getDao().actualizar(s);
	}

}
