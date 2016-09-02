package br.edu.estacio.interfaces.facade;

import java.util.ArrayList;
import java.util.List;

import br.edu.estacio.application.ConvidadoService;
import br.edu.estacio.application.ConvidadoServiceImpl;
import br.edu.estacio.domain.model.convidados.Convidado;
import br.edu.estacio.interfaces.dto.ConvidadoDTO;

public class ConvidadoServiceFacadeImpl implements ConvidadoServiceFacade {

	private ConvidadoService convidadoService = new ConvidadoServiceImpl();
	
	@Override
	public List<ConvidadoDTO> getAllConvidados() {
		List<Convidado> convidados = convidadoService.getAllConvidados();
		List<ConvidadoDTO> convidadosDTO = new ArrayList<ConvidadoDTO>();
		for (Convidado convidado: convidados){
			convidadosDTO.add(new ConvidadoDTO(convidado.getCodigo(),convidado.getNome()));
		}
		return convidadosDTO;
	}

	@Override
	public void addConvidados(String nome) {
		convidadoService.addConvidados(nome);		
	}

}
