package dao;



public interface DaoGenerico<T> {

	public Object buscar(Long id);

    public void guardar(Object entity);

    public void borrar(Object entity);

	public void actualizar(Object entity);

	
}
