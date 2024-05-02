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


import com.example.demo.entity.Cart;

import com.example.demo.service.CartService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/cart/")
public class CartController {
	@Autowired
	private CartService cartService;
	
	@PostMapping
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart){
		return new ResponseEntity<Cart>(cartService.addToCart(cart),HttpStatus.CREATED);	
	}
	
	@GetMapping
	public List<Cart> getAllBooksInCart(){
		return cartService.getAllBooksInCart();
	}
	
	@GetMapping("{custId}")
	public List<Cart> getBookById(@PathVariable ("custId")int custId) {
		return cartService.getCartBooksByCustId(custId);
	}
	

	@DeleteMapping("deleteCartById/{cId}")
	public List<Cart> deleteCartById(@PathVariable ("cId") int cId){
		return cartService.deleteByCId(cId);
	}
	
	@DeleteMapping("{custId}")
	public ResponseEntity<String> deleteCustomerCart(@PathVariable ("custId") int custId){
		cartService.deleteCartByCustId(custId);
		Gson gson = new Gson();
		return new ResponseEntity<String>(gson.toJson("Customer cart items deleted"),HttpStatus.OK);
	}
}
