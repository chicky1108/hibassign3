package com.cg.project.daoservices;

import java.util.List;

import com.cg.project.beans.Author;
public interface AuthorDAO {
		public Author save(Author author);
		public boolean update(Author author);
		public Author findOne(int authorId);
		public List<Author> findAll();
}
	