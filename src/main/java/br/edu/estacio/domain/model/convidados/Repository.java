package br.edu.estacio.domain.model.convidados;

import java.util.List;

public interface Repository<T> {
	
	public T findByName(String nome);

	public T find(int codigo);
	
	public void persist(T t);
	
	public T delete(int codigo);
	
	public List<T> findAll();	
	
	public String nextId();
	
}
