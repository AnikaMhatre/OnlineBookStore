package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.Order;



public interface OrderService {
	public Order saveOrder(Order order);

	public List<Order> getAllOrders();
	
    public Order getOrderById(int id);

    public Order updateOrder(int id, boolean isDelivered);
    
    public List<Order> getOrdersByCId(int cId);
    
    public List<Order> findByDelivered(boolean isDelivered);
    
    public List<Order> findOrdersByDate(String date);
    
    public List<Order> findOrdersByDates(String date1,String date2);

}
