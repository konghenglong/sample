package com.kh.demo.service;

import com.kh.demo.entity.many_to_many.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);

    Book update(Long id, Book book);

    Book findById(Long id);

    List<Book> findAll();

    void deleteById(Long id);
}
