package br.edu.estacio.infrastructure.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.edu.estacio.domain.model.convidados.Convidado;
import br.edu.estacio.domain.model.convidados.Repository;

public class ConvidadosRepository implements Repository<Convidado>{

	private List<Convidado> convs = new ArrayList<Convidado>();
	
	public Convidado find(int codigo) {
		for (Convidado convidado: convs){
			if (convidado.getCodigo().equals(codigo)) {
				return convidado;
			}
		}
		return null;
	}

	public void persist(Convidado t) {
		convs.add(t);
	}

	public Convidado delete(int codigo) {
		return convs.remove(codigo);
	}

	public List<Convidado> findAll() {
		return convs;
	}

	@Override
	public Convidado findByName(String nome) {
		for (Convidado convidado: convs){
			if (convidado.getNome().equals(nome)) {
				return convidado;
			}
		}
		return null;	
	}

	@Override
	public String nextId() {
	    final String random = UUID.randomUUID().toString().toUpperCase();
		return random.substring(0,random.indexOf("-"));
	}

}
