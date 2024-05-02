package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Order;



public interface OrderRepository  extends JpaRepository<Order, Integer>{

	public List<Order> findBycId(int cId);
	
	@Query(value = "select * from orders where is_delivered = ?1",nativeQuery = true)
	public List<Order> findByDelivered(boolean isDelivered);
	
	
	@Query(value = "SELECT * FROM orders WHERE DATE(order_date) = ?1",nativeQuery = true)
	public List<Order> findOrdersByDate(String date);
	
	@Query(value = "SELECT * FROM orders WHERE DATE(order_date) BETWEEN ?1 AND ?2",nativeQuery = true)
	public List<Order> findOrdersByDates(String date1,String date2);
	
	//get total number of book sold by book id
	//public String getTotalBookSoldByBId(int bId);
	
	
	//get total book solds (for admin section)
	//public String getTotalBooksSoldCount();
	
	//get total books sold by publisher
	
//	public String getTotalBookSoldByPId(int pId);
	
	
}
