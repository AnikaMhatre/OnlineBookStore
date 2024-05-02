package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart_table")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cart_id")
	private int cId;
	
	@Column(name = "customer_id")
	private int custId;
	
	@Column(name = "book_id")
	private int bId;
	
	@Column(name = "book_title")
	private String bTitle;
	
	@Column(name = "book_desc")
	private String bDesc;
	
	@Column(name = "book_price")
	private float bPrice;
	
	@Column(name = "book_imgpath")
	private String bImgPath;

	public Cart() {
		super();
	}	
	
	public Cart(int cId, int custId, int bId, String bTitle, String bDesc, float bPrice,String bImgPath) {
		super();
		this.cId = cId;
		this.custId = custId;
		this.bId = bId;
		this.bTitle = bTitle;
		this.bDesc = bDesc;
		this.bPrice = bPrice;
		this.bImgPath = bImgPath;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbDesc() {
		return bDesc;
	}

	public void setbDesc(String bDesc) {
		this.bDesc = bDesc;
	}

	public float getbPrice() {
		return bPrice;
	}

	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	

	public String getbImgPath() {
		return bImgPath;
	}

	public void setbImgPath(String bImgPath) {
		this.bImgPath = bImgPath;
	}

	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", custId=" + custId + ", bId=" + bId + "]";
	}
	
}
