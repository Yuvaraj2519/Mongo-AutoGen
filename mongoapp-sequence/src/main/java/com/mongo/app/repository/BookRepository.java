package com.mongo.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.app.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book,Integer>{
	
	List<Book> findBookById(int id);
}
