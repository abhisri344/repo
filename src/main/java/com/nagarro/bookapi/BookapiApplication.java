package com.nagarro.bookapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BookapiApplication class is the main class of our api it is the class which
 * is the entry point of our application
 * 
 * @author abhisheksrivastava02
 *
 */
@SpringBootApplication
public class BookapiApplication {

	/**
	 * main method is the first method which get called when we run any application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BookapiApplication.class, args);
	}

}
