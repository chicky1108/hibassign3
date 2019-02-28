package com.cg.project.daoservices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.project.beans.Book;

public class BookDAOservicesImpl implements BookDAO {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	
	public Book save(Book book) {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(book);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		return book;
	}

	
	
	public Book findOne(int ISBN) {
		// TODO Auto-generated method stub
		return entityManagerFactory.createEntityManager().find(Book.class, ISBN);
	}

	
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("from Book b",Book.class);
		return query.getResultList();
	}
}

