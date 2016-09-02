package br.edu.estacio.interfaces.dto;

public class ConvidadoDTO {

	private String codigo;
	private String nome;
	
	public ConvidadoDTO(String codigo,String nome){
		this.codigo=codigo;
		this.nome=nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	
}
