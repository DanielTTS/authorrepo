package com.tts.Authors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.Authors.model.Author;
import com.tts.Authors.service.AuthorServiceImpl;
//crud
@RestController
public class AuthorController {
	
	@Autowired
	AuthorServiceImpl authorServiceImpl;
	
	@GetMapping("/author/{id}")
	public Author displayAuthor(@PathVariable Long id) {
		return authorServiceImpl.getAuthor(id);
	}
	
	@PostMapping("/author/new")
	public void addAuthor(Author author) {
	 authorServiceImpl.saveAuthor(author);
	}
	
	@DeleteMapping("/author/delete{id}")
	public void deleteAuthor(@PathVariable Long id) {
		authorServiceImpl.removeAuthor(id);
	}
	
	@PutMapping("/author/{id}")
	public void createAuthor(@PathVariable Long id, Author author) {
		authorServiceImpl.updateAuthor(id, author);
	}
	
	
	
	
	
	
	
	
}
