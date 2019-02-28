package com.cg.project.daoservices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.project.beans.Author;

public class AuthorDAOservicesImpl implements AuthorDAO {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	@Override
	public Author save(Author author) {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(author);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		return author;
	}

	@Override
	public boolean update(Author author) {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(author);
		entityManager.getTransaction().commit();
		entityManager.close();
		return false;
	}

	@Override
	public Author findOne(int authorId) {
		// TODO Auto-generated method stub
		return entityManagerFactory.createEntityManager().find(Author.class, authorId);
	}

	@Override
	public List<Author> findAll() {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("from Author a",Author.class);
		return query.getResultList();
	}
	public boolean deleteAuthor(int authorId) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(entityManager.find(Author.class,authorId));
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	
	}
}

