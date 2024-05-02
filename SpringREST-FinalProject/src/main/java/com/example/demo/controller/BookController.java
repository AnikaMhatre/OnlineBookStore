package com.example.demo.controller;

import java.util.List;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/book/")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public ResponseEntity<Book> saveBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookService.saveBook(book),HttpStatus.CREATED);	
	}
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable ("bookId")int bookId) {
		return new ResponseEntity<Book>(bookService.getBookById(bookId),HttpStatus.OK);
	}
	
	@PutMapping("{bookId}")
	public ResponseEntity<Book> updateBook(@PathVariable ("bookId")int bookId,@RequestBody Book book){
		return new ResponseEntity<Book>(bookService.updateBook(bookId, book),HttpStatus.OK);
	}
	
	@PutMapping("updateBookSold/{bookId}/{booksSold}")
	public ResponseEntity<Book> updateBookSoldCount(@PathVariable ("bookId")int bookId,@PathVariable ("booksSold") int booksSold){
		return new	 ResponseEntity<Book>(bookService.updateBookSoldCount(bookId, booksSold),HttpStatus.OK);
	}
	
	@PutMapping("updateBookStatus/{bookId}/{bStatus}")
	public ResponseEntity<Book> updateBookStatus(@PathVariable ("bookId")int bookId,@PathVariable ("bStatus") String bStatus){
		return new ResponseEntity<Book>(bookService.updateBookStatus(bookId, bStatus),HttpStatus.OK);
	}
	
	@DeleteMapping("{bookId}")
	public List<Book> deleteBook(@PathVariable ("bookId") int bookId){
		return bookService.deleteBook(bookId);
	}
	
	@GetMapping("getBookCountByPublisher/{pId}")
	public ResponseEntity<String> getBookCountByPublisher(@PathVariable ("pId")int pId) {
		int count = bookService.getTotalBookCountByPublisher(pId);
		Gson gson = new Gson();
		return new ResponseEntity<String>(gson.toJson(count),HttpStatus.OK);
	}
	
	@GetMapping("getBooksByPublisher/{pId}")
	public List<Book> getBooksByPublisher(@PathVariable ("pId")int pId) {
		return bookService.getBooksByPublisher(pId);	
	}
	
	@GetMapping("getBooksByCategory/{bCategory}/{bId}")
	public List<Book> getBooksByCategory(@PathVariable ("bCategory")String bCategory,@PathVariable ("bId")int bId) {
		return bookService.findBooksBybCategory(bCategory,bId);	
	}
	
	@GetMapping("findBooksByCategory/{bCategory}")
	public List<Book> getBooksByCategory(@PathVariable ("bCategory")String bCategory) {
		return bookService.findBybCategory(bCategory);	
	}
	
	@GetMapping("findBooksByStatus/{bStatus}")
	public List<Book> getBooksByStatus(@PathVariable ("bStatus")String bStatus) {
		return bookService.findBybStatus(bStatus);	
	}
	
	@GetMapping("searchBook/{bTitle}")
	public List<Book> searchBook(@PathVariable ("bTitle")String bTitle) {
		return bookService.searchBook(bTitle);	
	}
	
	@GetMapping("getBookSoldByBId/{bId}")
	public int getBooksSoldByBId(@PathVariable ("bId")int bId){
		return bookService.getBooksSoldByBId(bId);
	}
	
	@GetMapping("getBookSoldByPId/{pId}")
	public int getBooksSoldByPId(@PathVariable ("pId")int pId){
		return bookService.getBooksSoldByPId(pId);
	}
}
