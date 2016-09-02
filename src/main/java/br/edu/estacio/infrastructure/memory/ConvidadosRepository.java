package br.edu.estacio.infrastructure.memory;

import java.util.List;

import br.edu.estacio.domain.model.convidados.Convidado;
import br.edu.estacio.domain.model.convidados.Convidados;

public class ConvidadosRepository implements Repository<Convidado,Convidados>{

	private Convidados convs;
	
	public ConvidadosRepository() throws InstantiationException, IllegalAccessException{
		convs = Convidados.class.newInstance();
	}
	
	public Convidado find(int codigo) {
		for (Convidado convidado: convs.getConvidados()){
			if (convidado.getCodigo().equals(codigo)) {
				return convidado;
			}
		}
		return null;
	}

	public void persist(Convidado t) {
		convs.addConvidado(t.getNome());
	}

	public Convidado delete(int codigo) {
		return convs.getConvidados().remove(codigo);
	}

	public List<Convidado> findAll() {
		return convs.getConvidados();
	}

	@Override
	public Convidado findByName(String nome) {
		for (Convidado convidado: convs.getConvidados()){
			if (convidado.getNome().equals(nome)) {
				return convidado;
			}
		}
		return null;	
	}

}
