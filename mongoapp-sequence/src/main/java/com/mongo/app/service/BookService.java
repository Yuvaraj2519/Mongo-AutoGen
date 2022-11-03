package com.mongo.app.service;

import java.util.List;

import com.mongo.app.entity.Book;

public interface BookService {
	
	int addBook(Book book);
	List<Book> findBookById(int id);
}
