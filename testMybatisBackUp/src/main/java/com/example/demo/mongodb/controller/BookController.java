package com.example.demo.mongodb.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mongodb.model.Book;
import com.example.demo.mongodb.repository.BookRepository;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestParam Map param,@RequestBody Book book) {
		System.out.println("param "+param.get("ename"));
		System.out.println("param "+param.get("depart"));
		System.out.println("param "+param.toString());
		book.setDepart(param.get("depart").toString());
		book.setEname(param.get("ename").toString());
		book.setHeight(param.get("height").toString());
		book.setStatus(param.get("status").toString());
		System.out.println("book = "+book);
		System.out.println("book = "+book.toString());
		repository.insert(book);
		return "Add book with id : " + book.get_id();
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks(){
		System.out.println(repository.findAll());
		
		return repository.findAll();
	}

}
