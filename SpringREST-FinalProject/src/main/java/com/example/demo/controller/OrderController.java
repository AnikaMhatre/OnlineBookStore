package com.example.demo.controller;

import java.util.Date;
import java.util.List;

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

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/order/")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.saveOrder(order), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
    
    @GetMapping("{orderId}")
	public ResponseEntity<Order> getOrderById(@PathVariable("orderId")int id)
	{
		return new ResponseEntity<Order>(orderService.getOrderById(id),HttpStatus.OK);
	}
	
	@PutMapping("{orderId}/{isDelivered}")
	public ResponseEntity<Order> updateOrder(@PathVariable("orderId")int id,@PathVariable("isDelivered")boolean isDelivered)
	{
		return new ResponseEntity<Order>(orderService.updateOrder(id,isDelivered),HttpStatus.OK);
	}
	
	@GetMapping("getOrdersByCId/{cId}")
    public List<Order> getOrdersByCId(@PathVariable ("cId")int cId) {
        return orderService.getOrdersByCId(cId);
    }
	
	@GetMapping("getOrdersByDelivered/{isDelivered}")
    public List<Order> getOrdersByDelivered(@PathVariable ("isDelivered")boolean isDelivered) {
        return orderService.findByDelivered(isDelivered);
    }
	
	@GetMapping("getOrdersByDates/{orderDate1}/{orderDate2}")
    public List<Order> getOrdersByDates(@PathVariable ("orderDate1")String orderDate1,@PathVariable ("orderDate2")String orderDate2) {
        return orderService.findOrdersByDates(orderDate1,orderDate2);
    }
	
	@GetMapping("getOrdersByDate/{orderDate}")
    public List<Order> getOrdersByDate(@PathVariable ("orderDate")String orderDate) {
        return orderService.findOrdersByDate(orderDate);
    }
	

}
