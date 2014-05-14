package servicios;


import classes.Socio;
import classes.Usuario;
import dao.DaoJpaGenerico;



public class SociosService {
	DaoJpaGenerico<Usuario> dao = new DaoJpaGenerico<Usuario>(Usuario.class);
	//UsuarioDaoImpl dao = new UsuarioDaoImpl(Usuario.class);
	
	public boolean eliminar(int id){
		System.out.println("El id a eliminar es: " + id);
		dao.borrar(id);
		return true;
	}
	
	public boolean modificar(Socio s){
		System.out.println("El id a editar es: " + s.getId());
		dao.actualizar(s);
		
		return true;
	}
	
//	public boolean crearSocio(int nroSocio, String usuario, String password,  String nombre, String apellido,int dni, String domicilio, String ocupacion, Date fechaNacimiento, Date fechaIngreso,
//			Date fechaDiagnostico, String presentadoPor, String telefono,
//			String email, boolean beneficio, boolean socioVirtual, TipoUnidad unidad) {
//		
//		Usuario u = new Usuario(usuario, password, nombre, apellido);	
//		//Guarda los usuarios
//		UsuarioDAO usuariodao = FactoryDAO.getUsuarioDAO();
//		usuariodao.guardar(u);
//
//		PerfilSocio perfilsocio = new PerfilSocio(nroSocio , dni , domicilio, ocupacion, fechaNacimiento, fechaIngreso ,fechaDiagnostico, presentadoPor, telefono, email ,beneficio);
//		perfilsocio.setSocioVirtual(socioVirtual);
//		
//		u.addPerfil(perfilsocio);
//		unidad.addPerfil(perfilsocio);
//		
//		PerfilDAO perfildao = FactoryDAO.getPerfilDAO();
//		perfildao.guardar(perfilsocio);
//		
//		return false;
//	}
}
