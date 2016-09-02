package br.edu.estacio.domain.model.convidados;

import br.edu.estacio.shared.Entity;

/**
 * DDD development doesnt have setters !!!
 * @author welder
 *
 */

public class Convidado implements Entity<Convidado>{

	private String codigo;
	
	private String nome;

	public Convidado(final String codigo, final String nome){
		this.codigo = codigo;
		this.nome=nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}

	/**
	 * An simple simulation of equalitty of entities
	 */
	@Override
	public boolean sameAs(Convidado other) {
		return other != null && this.getCodigo().equals(other);
	}

}

