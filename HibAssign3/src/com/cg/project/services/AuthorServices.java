package com.cg.project.services;

import java.util.List;

import com.cg.project.beans.Author;
import com.cg.project.exception.AuthorNotFoundException;

public interface AuthorServices {
	int acceptAuthorDetails(int authorId, String authorName);
	Author getAuthorDetails(int authorId) throws AuthorNotFoundException;
	List<Author>getAllAuthorDetails();
}
