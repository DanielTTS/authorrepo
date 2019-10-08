package com.tts.Authors.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.Authors.model.Author;


public interface AuthorRepository extends CrudRepository<Author, Long> {

	public Author findAuthorById(Long id);


	public void updateAuthorById(Long id, Author author);


	
}
