package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer>{
	@Query(value = "select * from books_table where publisher_id=?1",nativeQuery = true)
	public List<Book> getBooksByPublisher(int pId);
	
	@Query(value = "select count(book_id) from books_table where publisher_id=?1",nativeQuery = true)
	public int getTotalBookCountByPublisher(int pId);
	
	//find book by category exclude current book (to display similar books)
	@Query(value = "select * from books_table where book_cat = ?1 and book_id <> ?2",nativeQuery = true)
	public List<Book> findBooksBybCategory(String bCategory,int bId);
	
	//find book by category (display books by category navbar)
	public List<Book> findBybCategory(String bCatogory);
	
	public List<Book> findBybStatus(String bStatus);
	
	//update book sold count
	
	//search book
	@Query(value = "SELECT * FROM books_table WHERE book_cat LIKE CONCAT('%', ?1, '%') OR book_title LIKE CONCAT('%', ?1, '%')",nativeQuery = true)
	public List<Book> searchBook(String bTitle);
	
	//get books_sold by bid
	@Query(value = "select books_sold from books_table where book_id=?1",nativeQuery = true)
	public int getBooksSoldByBId(int bId);
	
	//select books_sold by pub_id
	@Query(value = "select sum(books_sold) from books_table where publisher_id=?1",nativeQuery = true)
	public int getBooksSoldByPId(int pId);
	
	
}
