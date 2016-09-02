package br.edu.estacio.infrastructure.memory;

import java.util.List;

public interface Repository<T,V> {
	
	public T findByName(String nome);

	public T find(int codigo);
	
	public void persist(T t);
	
	public T delete(int codigo);
	
	public List<T> findAll();	
	
}
