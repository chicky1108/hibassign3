package com.cg.project.daoservices;

import java.util.List;

import com.cg.project.beans.Book;
public interface BookDAO {
		public Book save(Book book);
		public Book findOne(int ISBN);
		public List<Book> findAll();
}
	