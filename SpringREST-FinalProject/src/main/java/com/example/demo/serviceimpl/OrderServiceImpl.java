package com.example.demo.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
        return orderRepository.save(order);	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
        return orderRepository.findAll();
	}

	@Override
	public Order getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).get();
	}

	@Override
	public Order updateOrder(int id, boolean isDelivered) {
		// TODO Auto-generated method stub
		Order order1 = getOrderById(id);
		order1.setDelivered(isDelivered);

		return orderRepository.save(order1);
	}

	@Override
	public List<Order> getOrdersByCId(int cId) {
		// TODO Auto-generated method stub
		return orderRepository.findBycId(cId);
	}

	@Override
	public List<Order> findByDelivered(boolean isDelivered) {
		// TODO Auto-generated method stub
		return orderRepository.findByDelivered(isDelivered);
	}

	@Override
	public List<Order> findOrdersByDate(String date) {
		// TODO Auto-generated method stub
		return orderRepository.findOrdersByDate(date);
	}

	@Override
	public List<Order> findOrdersByDates(String date1, String date2) {
		// TODO Auto-generated method stub
		return orderRepository.findOrdersByDates(date1, date2);
	}
    

}
