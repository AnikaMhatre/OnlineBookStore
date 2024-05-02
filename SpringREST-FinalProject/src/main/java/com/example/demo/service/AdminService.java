package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Admin;

public interface AdminService {
	public Admin saveAdmin(Admin admin);
	
	public List<Admin> getAllAdmin();
	
	public Admin getAdminById(int id);
	
	public Admin updateAdmin(int id, Admin admin);
	
	

}
