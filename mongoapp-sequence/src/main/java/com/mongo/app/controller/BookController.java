package com.mongo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.app.entity.Book;
import com.mongo.app.service.BookService;
import com.mongo.app.service.SeqGeneratorService;

import static com.mongo.app.entity.Book.*;

@RestController
@RequestMapping("/bookService")
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@Autowired
	private SeqGeneratorService seqs;
	
	@PostMapping("/addBook")
	public int addBook(Book book){
		book.setId(seqs.getSequenceNumber(SEQUENCE_NAME));
		return bookservice.addBook(book);
	}
	
	@GetMapping("/findBookWithId")
	public List<Book> findBookWithId(int id) {
		return bookservice.findBookById(id);
	}

}
