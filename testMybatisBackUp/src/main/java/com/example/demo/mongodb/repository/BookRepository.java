package com.example.demo.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{
	
}