package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@SpringBootTest
class SpringRestProjectEntitiesApplicationTests {

	@Autowired
	BookService bookService;
	
	static Book book;
	
	@BeforeAll
	static void beforeAll() throws Exception{
		book = new Book();
		book.setbTitle("Java");
		book.setbPrice(500);
		book.setbStatus("available");
	}
	
	@Disabled
	@Test
	void contextLoads() {
		assertNotNull(bookService.saveBook(book));
	}
	
	
	@Test
	void testGetAllBooks() {
		List<Book> bookList = bookService.getAllBooks();
		assertEquals(4, bookList.size());
	}
	
	@Test
	void getBookById() {
		Book book1 = bookService.getBookById(52);
		assertEquals("Java", book1.getbTitle());
		
	}
	

}
