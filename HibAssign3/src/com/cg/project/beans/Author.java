package com.cg.project.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="Author")
public class Author implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    @Id
    @Column(name="authorId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int authorId;
 
    @Column(name="authorName")
    private String authorName;
 
    @OneToMany(mappedBy="author")
    private List<Book> book; 
    public Author() 
    {
    	
    }
    
	

	public Author(int authorId, String authorName, List<Book> book) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.book = book;
	}



	

	


public Author(String authorName) {
		super();
		
		this.authorName = authorName;
	}



	public int getAuthorId() {
		return authorId;
	}



	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public List<Book> getBook() {
		return book;
	}



	public void setBook(List<Book> book) {
		this.book = book;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorId;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (authorId != other.authorId)
			return false;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", book=" + book + "]";
	}



	
}