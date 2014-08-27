package servicios;

import classes.Usuario;
import dao.UsuarioDao;
import dao.UsuarioDaoImpl;



public class LoginService {
	
	
	public Usuario loginUsuario(String email,String password){
		UsuarioDao dao = new UsuarioDaoImpl();
		return dao.getUser(email,password);
	}
	
}
