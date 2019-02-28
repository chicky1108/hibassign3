package com.cg.project.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int ISBN;
private String title;
private int price;

@ManyToOne
private Author author;
public Book() {}
public Book(int iSBN, String title, int price, Author author) {
	super();
	ISBN = iSBN;
	this.title = title;
	this.price = price;
	this.author = author;
}
public Book(String title,int price) {
	super();
	this.title = title;
	this.price = price;
}

public int getISBN() {
	return ISBN;
}
public void setISBN(int iSBN) {
	ISBN = iSBN;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ISBN;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + price;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
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
	Book other = (Book) obj;
	if (ISBN != other.ISBN)
		return false;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (price != other.price)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}
@Override
public String toString() {
	return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", author=" + author + "]";
}
}