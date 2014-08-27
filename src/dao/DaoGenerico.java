package dao;

import java.util.List;



public interface DaoGenerico<T> {

	public void guardar(T entity);
	public void borrar(T entity);
	public void eliminarPorId(Object id) ;
	public T buscar(Long id);
	public T actualizar(T entity);
	public List<T> listar();
}
