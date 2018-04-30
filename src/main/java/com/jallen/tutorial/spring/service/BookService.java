package com.jallen.tutorial.spring.service;

import java.util.List;

import com.jallen.tutorial.spring.model.Book;

public interface BookService {

    long save(Book book);
    Book get(long id);
    List<Book> list();
    void update(long id, Book book);
    void delete(long id);

}
