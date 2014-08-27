package query;

import java.util.ArrayList;
import java.util.List;

import classes.*;
import dao.*;


public class DbLoader {		


	public static void main(String[] args) {	
		
		
		// TIPOS DE UNIDADES
		TipoUnidadDao dao_tipo_unidad = DaosFactory.getTipoUnidadDao();
		
		TipoUnidad tipo_unidad1 = new TipoUnidad();
		TipoUnidad tipo_unidad2 = new TipoUnidad();
		TipoUnidad tipo_unidad3 = new TipoUnidad();
		TipoUnidad tipo_unidad4 = new TipoUnidad();
		TipoUnidad tipo_unidad5 = new TipoUnidad();
		
		tipo_unidad1.setNombre("Cennnntral");
		tipo_unidad2.setNombre("Filial");
		tipo_unidad3.setNombre("Delegacion");
		tipo_unidad4.setNombre("Grupo de Referencia");
		tipo_unidad5.setNombre("prueba a eliminar");
		
		dao_tipo_unidad.guardar(tipo_unidad1);
		dao_tipo_unidad.guardar(tipo_unidad2);
		dao_tipo_unidad.guardar(tipo_unidad3);
		dao_tipo_unidad.guardar(tipo_unidad4);
		dao_tipo_unidad.guardar(tipo_unidad5);
		
		System.out.println("###-----TIPO DE UNIDADES CREADAS ---------###");
		System.out.println("########------"+ tipo_unidad1.getNombre() +"--------##############");
	    System.out.println("########------"+ tipo_unidad2.getNombre() +"--------##############");
	    System.out.println("########------"+ tipo_unidad3.getNombre() +"--------##############");
	    System.out.println("########------"+ tipo_unidad4.getNombre() +"--------##############");
	    System.out.println("########------"+ tipo_unidad5.getNombre() +"--------##############");
	    
		
		//ACTUALIZACION TIPO UNIDADES
		tipo_unidad1.setNombre("Central");
	    dao_tipo_unidad.actualizar(tipo_unidad1);
	    System.out.println("###-----SE ACTUALIZO: "+ tipo_unidad1.getNombre() +" ---------###");
	    
	    
	    //BUSCAR Y ELIMINAR TIPO DE UNIDAD
	    Integer id = tipo_unidad5.getId();
	    TipoUnidad tu =  dao_tipo_unidad.buscar(TipoUnidad.class,id);
	    
	    dao_tipo_unidad.borrar(tu);
	    System.out.println("###-----BORRADO------###");
	    
	    
	    //PERFILES DE USUARIOS
	    PerfilDao dao_perfil = DaosFactory.getPerfilDao();
	    System.out.println("###-----<PERFILES>------###");
		Perfil perfil1 = new Perfil();
		Perfil perfil2 = new Perfil();
		Perfil perfil3 = new Perfil();
		Perfil perfil4 = new Perfil();
		Perfil perfil5 = new Perfil();
		Perfil perfil6 = new Perfil();
		
		
		perfil1.setNombre("socio");
		perfil2.setNombre("socio_virtual");
		perfil3.setNombre("administrador_unidad");
		perfil4.setNombre("operador_unidad");
		perfil5.setNombre("operador_central");
		perfil6.setNombre("administrador_central");
		
		
		dao_perfil.guardar(perfil1);
		dao_perfil.guardar(perfil2);
		dao_perfil.guardar(perfil3);
		dao_perfil.guardar(perfil4);
		dao_perfil.guardar(perfil5);
		dao_perfil.guardar(perfil6);
		
		id = perfil1.getId();
	    Perfil perf1 =  dao_perfil.buscar(Perfil.class,id);
	    id = perfil2.getId();
	    Perfil perf2 =  dao_perfil.buscar(Perfil.class,id);
	    id = perfil3.getId();
	    Perfil perf3 =  dao_perfil.buscar(Perfil.class,id);
	    id = perfil4.getId();
	    Perfil perf4 =  dao_perfil.buscar(Perfil.class,id);
	    id = perfil5.getId();
	    Perfil perf5 =  dao_perfil.buscar(Perfil.class,id);
	    id = perfil6.getId();
	    Perfil perf6 =  dao_perfil.buscar(Perfil.class,id);
		
		
		System.out.println("###-----PERFILES CREADOS ---------###");
		System.out.println("########------"+ perf1.getNombre() +"--------##############");
		System.out.println("########------"+ perf2.getNombre() +"--------##############");
		System.out.println("########------"+ perf3.getNombre() +"--------##############");
		System.out.println("########------"+ perf4.getNombre() +"--------##############");
		System.out.println("########------"+ perf5.getNombre() +"--------##############");
		System.out.println("########------"+ perf6.getNombre() +"--------##############");
		
		System.out.println("###-----</PERFILES>------###");
		
		List<Perfil> perfiles = new ArrayList<Perfil>();
		perfiles.add(perfil1);
		perfiles.add(perfil2);
		perfiles.add(perfil3);
	    
	    
	    System.out.println("###-----<TIPOS DE CUOTAS>------###");
	    //CREO TIPOS DE CUOTAS
	    TipoCuotaDao dao_tipo_cuota = DaosFactory.getTipoCuotaDao();
	    
	    TipoCuota tipo_cuota1 = new TipoCuota();
	    TipoCuota tipo_cuota2 = new TipoCuota();
	    
	    tipo_cuota1.setNombre("Normal");
	    tipo_cuota1.setModificable(true);
	    
	    tipo_cuota2.setNombre("Vitalicio");
	    tipo_cuota2.setModificable(false);
	    
	    dao_tipo_cuota.guardar(tipo_cuota1);
	    dao_tipo_cuota.guardar(tipo_cuota2);
	    
	    id = tipo_cuota1.getId();
	    TipoCuota tc1 =  dao_tipo_cuota.buscar(TipoCuota.class,id);
	    id = tipo_cuota2.getId();
	    TipoCuota tc2 =  dao_tipo_cuota.buscar(TipoCuota.class,id);
	    
	    System.out.println("###-----TIPOS DE CUOTAS CREADOS ---------###");
		System.out.println("########------"+ ((TipoCuota) tc1).getNombre() +"--------##############");
		System.out.println("########------"+ ((TipoCuota) tc2).getNombre() +"--------##############");
	    
	    List<TipoCuota> tipo_cuotas = new ArrayList<TipoCuota>();
	    tipo_cuotas.add(tipo_cuota1);
	    tipo_cuotas.add(tipo_cuota2);
	    
	    System.out.println("###-----</TIPOS DE CUOTAS>------###");
	    
	    //CREO USUARIOS
	    UsuarioDao dao_usuario = DaosFactory.getUsuarioDAO();
	     
	    System.out.println("###-----<USUARIOS>------###");
	    Usuario user1 = new Usuario();
	    Usuario user2 = new Usuario();
	    Usuario user3 = new Usuario();
	    Usuario user4 = new Usuario();
	    
	    user1.setNombre("Pablo");
	    user1.setApellido("sol");
	    user1.setEmail("so@asas.com");
	    user1.setPassword("1234");
	    user1.setDomicilio("calle 16");
	    user1.setTelefono("0303456");
	    user1.setPerfiles(perfiles);
	    
	    user2.setNombre("Agustin");
	    user2.setApellido("bea");
	    user2.setEmail("so@asas.com");
	    user2.setPassword("1234");
	    user2.setDomicilio("calle 16");
	    user2.setTelefono("0303456");
	    user2.setPerfiles(perfiles);
	    
	    user3.setNombre("Pedro");
	    user3.setApellido("mag");
	    user3.setEmail("so@asas.com");
	    user3.setPassword("1234");
	    user3.setDomicilio("calle 16");
	    user3.setTelefono("0303456");
	    user3.setPerfiles(perfiles);

	    user4.setNombre("Luciano");
	    user4.setApellido("cer");
	    user4.setEmail("so@asas.com");
	    user4.setPassword("1234");
	    user4.setDomicilio("calle 16");
	    user4.setTelefono("0303456");
	    user4.setPerfiles(perfiles);
	    
	    dao_usuario.guardar(user1);
	    dao_usuario.guardar(user2);
	    dao_usuario.guardar(user3);
	    dao_usuario.guardar(user4);
	    
	    id = user1.getId();
	    Usuario u1 =  dao_usuario.buscar(Usuario.class,id);
	    id = user2.getId();
	    Usuario u2 =  dao_usuario.buscar(Usuario.class,id);
	    id = user3.getId();
	    Usuario u3 =  dao_usuario.buscar(Usuario.class,id);
	    id = user4.getId();
	    Usuario u4 =  dao_usuario.buscar(Usuario.class,id);
	    
	    System.out.println("###-----USUARIOS CREADOS ---------###");
		System.out.println("########------"+ u1.getNombre() +"--------##############");
		System.out.println("########------"+ u2.getNombre() +"--------##############");
		System.out.println("########------"+ u3.getNombre() +"--------##############");
		System.out.println("########------"+ u4.getNombre() +"--------##############");
	    
	    
	    
	    List<Usuario> lista_usuarios1 = new ArrayList<Usuario>();
	    List<Usuario> lista_usuarios2 = new ArrayList<Usuario>();
	    lista_usuarios1.add(user1);
	    lista_usuarios1.add(user2);
	    lista_usuarios2.add(user3);
	    lista_usuarios2.add(user4);
	    
	    System.out.println("###-----</USUARIOS>------###");
	    
	    //CUENTA
	    CuentaDao dao_cuenta = DaosFactory.getCuentaDao();
	    
	    System.out.println("###-----<CUENTA>------###");
	    Cuenta unidad_cuenta1 = new Cuenta();
	    Cuenta unidad_cuenta2 = new Cuenta();
	    
	    dao_cuenta.guardar(unidad_cuenta1);
	    dao_cuenta.guardar(unidad_cuenta2);
	    
	    id = unidad_cuenta1.getId();
	    Cuenta c1 =  dao_cuenta.buscar(Cuenta.class,id);
	    id = unidad_cuenta2.getId();
	    Cuenta c2 =  dao_cuenta.buscar(Cuenta.class,id);
	    
	    System.out.println("###-----CUENTA CREADAS ---------###");
		System.out.println("########------"+ c1.getClass() +"--------##############");
		System.out.println("########------"+ c2.getClass() +"--------##############");
	    
	    System.out.println("###-----</CUENTA>------###");
	    
	    
	    
	    //CREO UNIDAD
	    System.out.println("###-----<UNIDAD>------###");
	    CentralDao dao_central = DaosFactory.getCentralDao();
	    FilialDao dao_filial = DaosFactory.getFilialDAO();
	    
	    
	    Central unidad1 = new Central();
	    Filial unidad2 = new Filial();
		
	    unidad1.setNombre("La Plata - Central");
	    unidad1.setDireccion("Calle 15 n 888");
	    unidad1.setEmail("aso@celi.com");
	    unidad1.setTelefono("424-4444");
	    
	    unidad2.setNombre("Pilar - Filial");
	    unidad2.setDireccion("Calle 17 n 888");
	    unidad2.setEmail("aso@celi.com");
	    unidad2.setTelefono("424-4444");
	    
	    // RELACIONES
	    unidad1.setCuenta(unidad_cuenta1);
	    unidad2.setCuenta(unidad_cuenta2);
	    
	    //tipo de unidad
	    unidad1.setTipo_unidad(tipo_unidad1);
	    unidad1.setUsuarios(lista_usuarios1);
	    unidad1.setTipo_cuotas(tipo_cuotas);
	    
	    unidad2.setTipo_unidad(tipo_unidad2);
	    unidad2.setUsuarios(lista_usuarios2);
	    unidad2.setTipo_cuotas(tipo_cuotas);
	    
	    
	    
		
	    System.out.println("###-----<CREO UNIDADES>------###");
	    
	    dao_central.guardar(unidad1);
	    dao_filial.guardar(unidad2);
		
	    System.out.println("###-----UNIDADES CREADAS ---------###");
		System.out.println("########------"+ unidad1.getNombre() +"--------##############");
	    System.out.println("########------"+ unidad2.getNombre() +"--------##############");
		
	    System.out.println("###-----LISTO------###");
		
		
	
	}

}