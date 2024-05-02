package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book Book) {
		// TODO Auto-generated method stub
		return bookRepository.save(Book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

	@Override
	public Book updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		Book book1 = getBookById(id);
		book1.setbTitle(book.getbTitle());
		book1.setbPrice(book.getbPrice());
		book1.setbStatus(book.getbStatus());
		book1.setbDesc(book.getbDesc());
		book1.setbCategory(book.getbCategory());
		book1.setbQuantity(book.getbQuantity());
		book1.setbImgPath(book.getbImgPath());
		return bookRepository.save(book1);
	}

	@Override
	public List<Book> deleteBook(int id) {
		// TODO Auto-generated method stub
		Book book1 = getBookById(id);
		bookRepository.deleteById(book1.getbId());
		return bookRepository.findAll();
	}

	@Override
	public int getTotalBookCountByPublisher(int pId) {
		// TODO Auto-generated method stub
		return bookRepository.getTotalBookCountByPublisher(pId);
	}

	@Override
	public List<Book> getBooksByPublisher(int pId) {
		// TODO Auto-generated method stub
		return bookRepository.getBooksByPublisher(pId);
	}

	@Override
	public List<Book> findBooksBybCategory(String bCategory,int bId) {
		// TODO Auto-generated method stub
		return bookRepository.findBooksBybCategory(bCategory,bId);
	}

	@Override
	public List<Book> findBybCategory(String bCatogory) {
		// TODO Auto-generated method stub
		return bookRepository.findBybCategory(bCatogory);
	}

	@Override
	public Book updateBookSoldCount(int bId,int booksSold) {
		// TODO Auto-generated method stub
		Book book1 = getBookById(bId);
		book1.setBooksSold(booksSold);
		return bookRepository.save(book1);	
	}

	@Override
	public Book updateBookStatus(int bId, String bStatus) {
		// TODO Auto-generated method stub
		Book book1 = getBookById(bId);
		book1.setbStatus(bStatus);
		return bookRepository.save(book1);	
	}

	@Override
	public List<Book> searchBook(String bTitle) {
		// TODO Auto-generated method stub
		return bookRepository.searchBook(bTitle);
	}

	@Override
	public int getBooksSoldByBId(int bId) {
		// TODO Auto-generated method stub
		return bookRepository.getBooksSoldByBId(bId);
	}

	@Override
	public int getBooksSoldByPId(int pId) {
		// TODO Auto-generated method stub
		return bookRepository.getBooksSoldByPId(pId);
	}

	@Override
	public List<Book> findBybStatus(String bStatus) {
		// TODO Auto-generated method stub
		return bookRepository.findBybStatus(bStatus);
	}
	
}
