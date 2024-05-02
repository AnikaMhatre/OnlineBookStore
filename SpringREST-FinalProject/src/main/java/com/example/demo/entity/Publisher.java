package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="publisher_table")
public class Publisher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="publisher_id")
	private int pId;
	@Column(name="publisher_name")
	private String pName;
	@Column(name="publisher_email")
	private String email;
	@Column(name="publisher_password")
	private String password;
	@Column(name="publisher_country")
	private String pCountry;
	@Column(name="publisher_status")
	private boolean pStatus;
	
	public Publisher(int pId, String pName, String email, String password, String pCountry,boolean pStatus) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.email = email;
		this.password = password;
		this.pCountry = pCountry;
		this.pStatus = pStatus;
	}

	
	public Publisher() {
		super();
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCountry() {
		return pCountry;
	}
	public void setpCountry(String pCountry) {
		this.pCountry = pCountry;
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

	public boolean ispStatus() {
		return pStatus;
	}

	public void setpStatus(boolean pStatus) {
		this.pStatus = pStatus;
	}
	
	public boolean getpStatus() {
		return pStatus;
	}

	@Override
	public String toString() {
		return "Publisher [pId=" + pId + ", pName=" + pName + ", email=" + email + ", password=" + password
				+ ", pCountry=" + pCountry + ", pStatus=" + pStatus + "]";
	}

	
}
