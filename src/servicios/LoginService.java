package servicios;


import classes.Usuario;
import dao.UsuarioDaoImpl;



public class LoginService {
	
	
	public Usuario loginUsuario(String email,String password){
		
		UsuarioDaoImpl dao = new UsuarioDaoImpl(Usuario.class);
		
		return dao.buscarUsuario(email,password);
		
		
	}
	
	
	
}
