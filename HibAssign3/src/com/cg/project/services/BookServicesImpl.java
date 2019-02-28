package com.cg.project.services;

import java.util.List;

import com.cg.project.beans.Author;
import com.cg.project.beans.Book;
import com.cg.project.daoservices.AuthorDAOservicesImpl;
import com.cg.project.daoservices.BookDAOservicesImpl;
import com.cg.project.exception.AuthorNotFoundException;
import com.cg.project.exception.BookNotFoundException;

public class BookServicesImpl implements BookServices {
	private BookDAOservicesImpl bookDAO = new BookDAOservicesImpl();
	
	public int acceptBookDetails(int ISBN, String title, int price) {
		// TODO Auto-generated method stub
		Book book = new Book(title,price);
		book =bookDAO.save(book);
		return book.getISBN();
		
	}

	
	public Book getBookDetails(int ISBN) throws BookNotFoundException {
		// TODO Auto-generated method stub
		Book book = bookDAO.findOne(ISBN);
		if(book == null) 
		    throw new BookNotFoundException("Book Details Not Found for Id " + ISBN);
		return book;
		
	}

	
	public List<Book> getAllBookDetails() {
		// TODO Auto-generated method stub
		return bookDAO.findAll();
		
	}


	
	
	

	


	

	
}
