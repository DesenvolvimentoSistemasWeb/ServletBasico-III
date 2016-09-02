package br.edu.estacio.application;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.edu.estacio.domain.model.convidados.Convidado;
import br.edu.estacio.infrastructure.memory.ConvidadosRepository;

public class ConvidadoServiceImpl implements ConvidadoService {

	private Log logger = LogFactory.getLog(getClass());
	
	private ConvidadosRepository convidadosRepository = new ConvidadosRepository();
	
	@Override
	public List<Convidado> getAllConvidados() {
		return convidadosRepository.findAll();
	}

	@Override
	public void addConvidados(String nome) {
		final String codigo = convidadosRepository.nextId();
		final Convidado convidado = new Convidado(codigo,nome);
		convidadosRepository.persist(convidado);
		logger.info("Convidado criado com o código "+convidado.getCodigo());
	}

}
