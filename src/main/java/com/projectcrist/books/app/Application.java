package com.projectcrist.books.app;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import com.projectcrist.books.app.daos.IDaoBooks;
import com.projectcrist.books.app.daos.IDaoGenero;
import com.projectcrist.books.app.documents.Book;
import com.projectcrist.books.app.documents.Genero;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class Application implements CommandLineRunner {

	
	@Autowired
	private IDaoGenero daoGenero;
	
	@Autowired
	private IDaoBooks daoBooks;
	
	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mongoTemplate.dropCollection("genero").subscribe();
		mongoTemplate.dropCollection("book").subscribe();
		Genero g = new Genero("Romance");
		Flux.just(g,new Genero("accion")).flatMap(daoGenero::save)
		.thenMany(
				Flux.just(new Book("Narnia","Cristhian Palacios",new Date(),g) ).flatMap(daoBooks::save)
				)
		.subscribe();
		
		
	}

}
