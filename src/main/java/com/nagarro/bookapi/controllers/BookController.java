package com.nagarro.bookapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nagarro.bookapi.models.Book;
import com.nagarro.bookapi.service.BookService;

/**
 * BookController class is responsible for handling all the routes and calls
 * specific functions depending on routes
 * 
 * @author abhisheksrivastava02
 *
 */
@RestController
public class BookController {

	@Autowired
	private BookService service;

	/**
	 * addBook method takes Book Object from request body and passes it to saveBook
	 * method of service class for adding to database
	 * 
	 * @param book - object of Book class to add in database
	 * @return the book object that was added
	 */
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return service.saveBook(book);
	}

	/**
	 * findAllBooks method returns all the books currently present in database
	 * 
	 * @return - list of books present in database
	 */
	@GetMapping(path = "/books")
	public List<Book> findAllBooks() {
		return service.getBooks();
	}

	/**
	 * findBookById method gets the id of the book to search from url and call
	 * getBookById method of service class
	 * 
	 * @param id - Id of the book to search
	 * @return object of book class which has the id equal to the passed Id
	 */
	@GetMapping(path = "/books/{id}")
	public Book findBookById(@PathVariable int id) {
		return service.getBookById(id);
	}

	/**
	 * updateBook method takes a book object from request body and updates its
	 * details in the database using updateBook method of service class
	 * 
	 * @param book - object of Book class to add in database
	 * @return the book object that was updated
	 */
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return service.updateBook(book);
	}

	/**
	 * deleteBook method gets the id of the book to delete from url and call
	 * deleteBook method of service class to delete that book from database
	 * 
	 * @param id - Id of the book to delete
	 * @return the id of book that was removed
	 */
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable int id) {
		return service.deleteBook(id);
	}
}
