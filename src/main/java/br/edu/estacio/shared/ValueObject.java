package br.edu.estacio.shared;

import java.io.Serializable;

public interface ValueObject<T> extends Serializable {

	boolean sameAs(T other);
	
}
