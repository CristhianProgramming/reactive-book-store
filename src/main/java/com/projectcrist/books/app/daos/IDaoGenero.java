package com.projectcrist.books.app.daos;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;

import com.projectcrist.books.app.documents.Genero;


@Component
public interface IDaoGenero extends ReactiveCrudRepository<Genero, String> {

}
