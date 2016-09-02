package br.edu.estacio.domain.model.convidados;

import java.util.ArrayList;
import java.util.List;

public final class Convidados {

	private List<Convidado> convidados = new ArrayList<Convidado>();
	
	public void addConvidado(String nome){
		Convidado conv = new Convidado();
		conv.setCodigo(Integer.toString(1));
		conv.setNome(nome);
		convidados.add(conv);
	}
	
	public ArrayList<Convidado> getConvidados(){
		return (ArrayList<Convidado>) convidados;
	}
	
}
