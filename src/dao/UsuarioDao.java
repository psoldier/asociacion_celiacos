package dao;
import java.util.List;

import classes.*;



public interface UsuarioDao extends DaoGenerico<Usuario> {

	
	public Usuario buscarUsuario(String email, String password);
	
	//public List<Usuario> listaOperadorCentral();
	

}
