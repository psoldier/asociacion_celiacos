package dao;

public class DaosFactory {
	
	public static UsuarioDao getUsuarioDAO() {
		return new UsuarioDaoImpl();
	}
	public static DelegacionDao getDelegacionDAO() {
		return new DelegacionDaoImpl();
	}
	public static FilialDao getFilialDAO() {
		return new FilialDaoImpl();
	}
	public static GrupoDeReferenciaDao getGrupoDeReferenciaDao() {
		return new GrupoDeReferenciaDaoImpl();
	}
	public static SocioDao getSocioDao() {
		return new SocioDaoImpl();
	}
	public static TipoUnidadDao getTipoUnidadDao() {
		return new TipoUnidadDaoImpl();
	}
	public static PerfilDao getPerfilDao() {
		return new PerfilDaoImpl();
	}
	public static TipoCuotaDao getTipoCuotaDao() {
		return new TipoCuotaDaoImpl();
	}
	public static CuentaDao getCuentaDao() {
		return new CuentaDaoImpl();
	}
	public static CentralDao getCentralDao() {
		return new CentralDaoImpl();
	}
}
