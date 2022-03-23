package com.nagarro.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.bookapi.models.Book;

/**
 * BookRepository is the interface which is responsible for interacting with
 * database
 * 
 * @author abhisheksrivastava02
 *
 */
public interface BookRepository extends JpaRepository<Book, Integer> {

}
