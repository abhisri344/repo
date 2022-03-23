package com.nagarro.bookapi.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;

/**
 * Book is the model class for storing books in the database
 * 
 * @author abhisheksrivastava02
 *
 */
@Entity
public class Book {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String author;
	private String dateAdded;

	/**
	 * Non parameterized constructor for initializing instance variables
	 */
	public Book() {
		super();
		setDateAdded();
		this.dateAdded = getDateAdded();
	}

	/**
	 * Parameterized constructor for initializing instance variables
	 * 
	 * @param id     - id of the book
	 * @param name   - name of the book
	 * @param author - author of the book
	 */
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		setDateAdded();
		this.dateAdded = getDateAdded();
	}

	/**
	 * getter method to get id of the book
	 * 
	 * @return id of the book
	 */
	public int getId() {
		return id;
	}

	/**
	 * setter method for setting id of the book
	 * 
	 * @param id - id to set to the book
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * getter method for getting name of the book
	 * 
	 * @return name of the book
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter method for setting name of the book
	 * 
	 * @param name - name to set to the book
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter method for getting author of the book
	 * 
	 * @return author of the book
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * setter method for setting author of the book
	 * 
	 * @param author - author to set to the book
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * getter method for getting date of addition of the book
	 * 
	 * @return date of addition of the book
	 */
	public String getDateAdded() {
//		System.out.println(dateAdded+"----------");
		return dateAdded;
	}

	/**
	 * setter method for setting date of addition of the book which is the current
	 * date
	 */
	public void setDateAdded() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

		this.dateAdded = formatter.format(date);
	}

	/**
	 * toString method for printing Book object
	 * 
	 * @return a string representing the book object
	 */
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", dateAdded=" + dateAdded + "]";
	}

}
