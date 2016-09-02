package br.edu.estacio.interfaces.facade;

import java.util.List;

import br.edu.estacio.interfaces.dto.ConvidadoDTO;

public interface ConvidadoServiceFacade {

	public List<ConvidadoDTO> getAllConvidados();
	
	public void addConvidados(String nome);
	
}
