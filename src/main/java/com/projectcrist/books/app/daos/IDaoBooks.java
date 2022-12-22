package com.projectcrist.books.app.daos;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.projectcrist.books.app.documents.Book;

public interface IDaoBooks extends ReactiveCrudRepository<Book, String> {

}
