package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="customer")
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cust_id;

	private String customer_name;
	private String customer_address;
	private String customer_contact;
	private String email;
	private String password;
	
	public Customer(int cust_id, String customer_name, String customer_address, String customer_contact,
			String email, String password) {
		super();
		this.cust_id = cust_id;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.customer_contact = customer_contact;
		this.email = email;
		this.password = password;
	}
	
	public Customer() 
	{
		
	}
	
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	
	public String getCustomer_contact() {
		return customer_contact;
	}
	public void setCustomer_contact(String customer_contact) {
		this.customer_contact = customer_contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", customer_name=" + customer_name + ", customer_address="
				+ customer_address + ", customer_contact=" + customer_contact + ", email=" + email + ", password="
				+ password + "]";
	}
	
}
