package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Book;
import com.example.demo.entity.Cart;
import com.example.demo.repository.CartRepository;
import com.example.demo.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepositoy;
	
	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepositoy.save(cart);
	}

	@Override
	public List<Cart> getAllBooksInCart() {
		// TODO Auto-generated method stub
		return cartRepositoy.findAll();
	}

	@Override
	public List<Cart> getCartBooksByCustId(int custId) {
		// TODO Auto-generated method stub
		return cartRepositoy.findByCustId(custId);
	}

	@Transactional
	@Override
	public void deleteCartByCustId(int custId) {
		// TODO Auto-generated method stub
		cartRepositoy.deleteCustomerCart(custId);
	}

	@Override
	public List<Cart> deleteByCId(int cId) {
		// TODO Auto-generated method stub
		Cart cart1 = getCartById(cId);
		cartRepositoy.deleteById(cart1.getcId());
		return cartRepositoy.findAll();
	}

	@Override
	public Cart getCartById(int cId) {
		// TODO Auto-generated method stub
		return cartRepositoy.findById(cId).get();
	}
	
}
