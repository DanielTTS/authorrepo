package com.tts.Authors.service;

import com.tts.Authors.model.Author;

public interface AuthorServiceInt {

	Author getAuthor(Long id);

	void saveAuthor(Author author);

	void removeAuthor(Long id);

	void updateAuthor(Long id, Author author);

	

}
