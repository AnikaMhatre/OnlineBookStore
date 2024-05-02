package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;
	
public interface BookService {
	public Book saveBook(Book book);
	
	public List<Book> getAllBooks();
	
	public Book getBookById(int id);
	
	public Book updateBook(int id,Book book);
	
	public List<Book> deleteBook(int id);
	
	public int getTotalBookCountByPublisher(int pId);
	
	public List<Book> getBooksByPublisher(int pId);
	
	//find book by category(similar books display)
	public List<Book> findBooksBybCategory(String bCategory,int bId);
	
	public List<Book> findBybCategory(String bCatogory);
	
	public List<Book> findBybStatus(String bStatus);

	
	//update book sold count
	public Book updateBookSoldCount(int bId,int booksSold);
	
	//update book status
	public Book updateBookStatus(int bId,String bStatus);
	
	//search book
	public List<Book> searchBook(String bTitle);
	
	//get books sold by bId
	public int getBooksSoldByBId(int bId);
	
	public int getBooksSoldByPId(int pId);

}
