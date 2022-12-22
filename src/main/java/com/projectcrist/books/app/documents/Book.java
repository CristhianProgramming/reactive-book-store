package com.projectcrist.books.app.documents;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	
	@Id
	private String id;

	private String nombre;

	private String author;

	private Date Lanzamiento;

	private Genero genero;

	private Boolean disponbile;

	public Book() {

	}

	public Book(String nombre, String author, Date lanzamiento, Genero genero) {
		super();
		this.nombre = nombre;
		this.author = author;
		Lanzamiento = lanzamiento;
		this.genero = genero;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getLanzamiento() {
		return Lanzamiento;
	}

	public void setLanzamiento(Date lanzamiento) {
		Lanzamiento = lanzamiento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Boolean getDisponbile() {
		return disponbile;
	}

	public void setDisponbile(Boolean disponbile) {
		this.disponbile = disponbile;
	}

}
