package dao;

import java.util.List;

import classes.ObjetoPersistente;



public interface InterfaceDao<T> {


	public void guardar(T entity);

	public void actualizar(T entity);
	
	public T buscar(Class<? extends ObjetoPersistente>nombreClase, Integer id);
	
	public void borrar(T entity);
	
	public List<T> listar();
}
