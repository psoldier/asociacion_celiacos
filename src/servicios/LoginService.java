package servicios;

import classes.Usuario;
import dao.DaosFactory;
import dao.UsuarioDao;

public class LoginService {
	
	public Usuario loginUsuario(String email,String password){
		UsuarioDao dao = DaosFactory.getUsuarioDAO();
		return dao.getUser(email,password);
	}
}
