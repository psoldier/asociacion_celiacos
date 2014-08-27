package dao;

import classes.Usuario;

public interface UsuarioDao extends InterfaceDao<Usuario> {
	public Usuario getUser(String email, String password);
	public Usuario getUser(String email);
}
