package com.mongo.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.app.entity.Book;
import com.mongo.app.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookrepo;
	
	@Override
	public int addBook(Book book) {
		
		return bookrepo.save(book).getId();
	}

	@Override
	public List<Book> findBookById(int id) {
		
		return bookrepo.findBookById(id);
	}

}
