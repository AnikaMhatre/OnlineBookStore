package com.example.demo.entity;

import org.springframework.boot.context.properties.bind.ConstructorBinding;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Embeddable
@Entity
@Table(name="books_table")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_id")
	private int bId;
	@Column(name="publisher_id")
	private int pId;
	@Column(name="book_title")
	private String bTitle;
	@Column(name="book_desc")
	private String bDesc;
	@Column(name="book_cat")
	private String bCategory;
	@Column(name="book_status")
	private String bStatus;
	@Column(name="book_price")
	private float bPrice;
	@Column(name="book_quantity")
	private int bQuantity;
	@Column(name="book_imgPath")
	private String bImgPath;
	@Column(name = "books_sold")
	private int booksSold;
	
	public Book() {
		super();
	}
	
	public Book(int bId, int pId, String bTitle, String bDesc, String bCategory, String bStatus, float bPrice,
			int bQuantity, String bImgPath,int booksSold) {
		super();
		this.bId = bId;
		this.pId = pId;
		this.bTitle = bTitle;
		this.bDesc = bDesc;
		this.bCategory = bCategory;
		this.bStatus = bStatus;
		this.bPrice = bPrice;
		this.bQuantity = bQuantity;
		this.bImgPath = bImgPath;
		this.booksSold = booksSold;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
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

	public String getbCategory() {
		return bCategory;
	}

	public void setbCategory(String bCategory) {
		this.bCategory = bCategory;
	}

	public String getbStatus() {
		return bStatus;
	}

	public void setbStatus(String bStatus) {
		this.bStatus = bStatus;
	}

	public float getbPrice() {
		return bPrice;
	}

	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}

	public int getbQuantity() {
		return bQuantity;
	}

	public void setbQuantity(int bQuantity) {
		this.bQuantity = bQuantity;
	}

	public String getbImgPath() {
		return bImgPath;
	}

	public void setbImgPath(String bImgPath) {
		this.bImgPath = bImgPath;
	}

	public int getBooksSold() {
		return booksSold;
	}

	public void setBooksSold(int booksSold) {
		this.booksSold = booksSold;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", pId=" + pId + ", bTitle=" + bTitle + ", bDesc=" + bDesc + ", bCategory="
				+ bCategory + ", bStatus=" + bStatus + ", bPrice=" + bPrice + ", bQuantity=" + bQuantity + ", bImgPath="
				+ bImgPath + "]";
	}	
	
}
