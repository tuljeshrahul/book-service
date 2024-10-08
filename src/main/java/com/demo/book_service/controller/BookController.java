package com.demo.book_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.book_service.dao.BookDao;
import com.demo.book_service.entity.BookEntity;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookDao dao;
	
	@GetMapping
	public List<BookEntity> getAllBooks(){
		return dao.findAll();
	}
	
	@PostMapping
	public BookEntity addABook(@RequestBody BookEntity book) {
		dao.saveAndFlush(book);
		return book;
	}
	
	@GetMapping("/{bid}")
	public BookEntity getABook(@PathVariable long bid) {
		return dao.findById(bid).orElse(null);
	}
}
