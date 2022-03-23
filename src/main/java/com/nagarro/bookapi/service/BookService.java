package com.nagarro.bookapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.bookapi.models.Book;
import com.nagarro.bookapi.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * BookService class is responsible for interacting with database and providing
 * various CRUD functionalities
 * 
 * @author abhisheksrivastava02
 *
 */
@Service
public class BookService {
	@Autowired
	private BookRepository repository;

	/**
	 * saveBook method saves passed book object to the database
	 * 
	 * @param book - Book object to be added to database
	 * @return added Book object
	 */
	public Book saveBook(Book book) {
		return repository.save(book);
	}

	/**
	 * getBooks method gives a list of books currently present in the database
	 * 
	 * @return list of books
	 */
	public List<Book> getBooks() {
		return repository.findAll();
	}

	/**
	 * getBookById method returns the book matching the passed id from the database
	 * 
	 * @param id - id of book to search
	 * @return Book object matching the passed id
	 */
	public Book getBookById(int id) {
		return repository.findById(id).orElse(null);
	}

	/**
	 * deleteBook method deletes the book matching the given id
	 * 
	 * @param id - id of book to delete
	 * @return String representing the id of the book deleted
	 */
	public String deleteBook(int id) {
		if((repository.findById(id).orElse(null)) != null)
			repository.deleteById(id);
		return "Book removed !! " + id;
	}

	/**
	 * updateBook method updates the details of the book in the database
	 * 
	 * @param book - Book object to be updated
	 * @return updated book object
	 */
	public Book updateBook(Book book) {
		Book existingBook = repository.findById(book.getId()).orElse(null);
		
		existingBook.setName(book.getName());
		existingBook.setAuthor(book.getAuthor());
		return repository.save(existingBook);

	}

}