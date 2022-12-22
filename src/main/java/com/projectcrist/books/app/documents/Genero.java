package com.projectcrist.books.app.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Genero {
	
	@Id
	private String id;
	
	private String nombre;

	public Genero(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
}
