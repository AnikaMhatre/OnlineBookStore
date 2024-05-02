package com.example.demo.entity;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "order_no", unique = true, nullable = false)
	    private Long orderNo;
	 	
	 	@Column(name = "razorpay_payment_id")
	 	private String razorpayPaymentId;
	    
		@Column(name = "razorpay_order_id")
	 	private String razorpayOrderId;
		
		@Column(name = "razorpay_signature")
	 	private String razorpaySignature;
		
	    @Column(name = "order_date")
	    private Date orderDate;
	    
	    @Column(name = "order_amount")
	    private double orderAmount;
	    
	    @Column(name = "customer_id")
	    private int cId;
	    
	    @Column(name = "book_id")
	    private int[] bId;
	    
	    @Column(name = "book_title")
	    private String[] bTitle;
	    
	    @Column(name = "book_price")
	    private float[] bPrice;
	    
	    @Column(name = "book_imgpath")
	    private String[] bImgpath;
	    
	    @Column(name = "book_count")
	    private int bCount;
	    
	    @Column(name = "isDelivered")
	    private boolean isDelivered;

		public Order(Long orderNo, String razorpayPaymentId, String razorpayOrderId, String razorpaySignature,
				Date orderDate, double orderAmount, int cId, int[] bId, String[] bTitle, float[] bPrice,
				String[] bImgpath, int bCount, boolean isDelivered) {
			super();
			this.orderNo = orderNo;
			this.razorpayPaymentId = razorpayPaymentId;
			this.razorpayOrderId = razorpayOrderId;
			this.razorpaySignature = razorpaySignature;
			this.orderDate = orderDate;
			this.orderAmount = orderAmount;
			this.cId = cId;
			this.bId = bId;
			this.bTitle = bTitle;
			this.bPrice = bPrice;
			this.bImgpath = bImgpath;
			this.bCount = bCount;
			this.isDelivered = isDelivered;
		}

		public Order() {
	    	super();
	    }

		public Long getOrderNo() {
			return orderNo;
		}

		public void setOrderNo(Long orderNo) {
			this.orderNo = orderNo;
		}

		public String getRazorpayPaymentId() {
			return razorpayPaymentId;
		}

		public void setRazorpayPaymentId(String razorpayPaymentId) {
			this.razorpayPaymentId = razorpayPaymentId;
		}

		public String getRazorpayOrderId() {
			return razorpayOrderId;
		}

		public void setRazorpayOrderId(String razorpayOrderId) {
			this.razorpayOrderId = razorpayOrderId;
		}

		public String getRazorpaySignature() {
			return razorpaySignature;
		}

		public void setRazorpaySignature(String razorpaySignature) {
			this.razorpaySignature = razorpaySignature;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public double getOrderAmount() {
			return orderAmount;
		}

		public void setOrderAmount(double orderAmount) {
			this.orderAmount = orderAmount;
		}

		public int getcId() {
			return cId;
		}

		public void setcId(int cId) {
			this.cId = cId;
		}

		public int[] getbId() {
			return bId;
		}

		public void setbId(int[] bId) {
			this.bId = bId;
		}

		public String[] getbTitle() {
			return bTitle;
		}

		public void setbTitle(String[] bTitle) {
			this.bTitle = bTitle;
		}

		public float[] getbPrice() {
			return bPrice;
		}

		public void setbPrice(float[] bPrice) {
			this.bPrice = bPrice;
		}

		public String[] getbImgpath() {
			return bImgpath;
		}

		public void setbImgpath(String[] bImgpath) {
			this.bImgpath = bImgpath;
		}

		public int getbCount() {
			return bCount;
		}

		public void setbCount(int bCount) {
			this.bCount = bCount;
		}

		public boolean isDelivered() {
			return isDelivered;
		}

		public void setDelivered(boolean isDelivered) {
			this.isDelivered = isDelivered;
		}

		@Override
		public String toString() {
			return "Order [orderNo=" + orderNo + ", razorpayPaymentId=" + razorpayPaymentId + ", razorpayOrderId="
					+ razorpayOrderId + ", razorpaySignature=" + razorpaySignature + ", orderDate=" + orderDate
					+ ", orderAmount=" + orderAmount + ", cId=" + cId + ", bId=" + Arrays.toString(bId) + ", bTitle="
					+ Arrays.toString(bTitle) + ", bPrice=" + Arrays.toString(bPrice) + ", bImgpath="
					+ Arrays.toString(bImgpath) + ", bCount=" + bCount + ", isDelivered=" + isDelivered + "]";
		}

		
	    

}
