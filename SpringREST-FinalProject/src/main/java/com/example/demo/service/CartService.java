package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Cart;

public interface CartService {
	
	public Cart addToCart(Cart cart);
	
	public List<Cart> getAllBooksInCart();
	
	public List<Cart> getCartBooksByCustId(int custId);
	
	public List<Cart> deleteByCId(int cId);
	
	public Cart getCartById(int cId);
	
	public void deleteCartByCustId(int custId);

}
