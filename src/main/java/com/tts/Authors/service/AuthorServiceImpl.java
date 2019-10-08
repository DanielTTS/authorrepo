package com.tts.Authors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.Authors.model.Author;
import com.tts.Authors.repository.AuthorRepository;

	@Service
public class AuthorServiceImpl implements AuthorServiceInt {
	@Autowired
	AuthorRepository authorRepository;
	
	@Override
	public Author getAuthor(Long id) {
		return authorRepository.findAuthorById(id);
	}
	
	@Override
	public void saveAuthor(Author author) {
		authorRepository.save(author);
	}
	
	@Override
	public void removeAuthor(Long id) {
		authorRepository.deleteById(id);
	}
	
	@Override
	public void updateAuthor(Long id, Author author) {
		authorRepository.updateAuthorById(id,author);
	}
	
}
