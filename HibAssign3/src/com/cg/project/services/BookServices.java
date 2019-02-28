package com.cg.project.services;

import java.util.List;

import com.cg.project.beans.Author;
import com.cg.project.beans.Book;
import com.cg.project.exception.BookNotFoundException;

public interface BookServices {
	int acceptBookDetails(int ISBN,String title,int price);
	Book getBookDetails(int ISBN) throws BookNotFoundException;
	List<Book>getAllBookDetails();
}
