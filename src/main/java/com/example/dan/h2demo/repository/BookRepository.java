package com.example.dan.h2demo.repository;

import com.example.dan.h2demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}
