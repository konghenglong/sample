package com.kh.demo.service;

import com.kh.demo.entity.many_to_many.Author;

import java.util.List;

public interface AuthorService {

    Author save(Author author);

    Author update(Long id, Author author);

    Author findById(Long id);

    List<Author> findAll();

    void deleteById(Long id);
}
