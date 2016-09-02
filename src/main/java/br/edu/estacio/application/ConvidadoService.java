package br.edu.estacio.application;

import java.util.List;

import br.edu.estacio.domain.model.convidados.Convidado;

public interface ConvidadoService {

	public List<Convidado> getAllConvidados();
	
	public void addConvidados(String nome);	
	
}
