package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

import com.google.gson.Gson;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/admin/")
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	@PostMapping
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin){
		return new ResponseEntity<Admin>(adminservice.saveAdmin(admin),HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Admin> getAllAdmin() {
		return adminservice.getAllAdmin();
	}
	
	@GetMapping("{adminId}")
	public ResponseEntity<Admin> getAdminById(@PathVariable("adminId")int id)
	{
		return new ResponseEntity<Admin>(adminservice.getAdminById(id),HttpStatus.OK);
	}
	
	@PutMapping("{adminId}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable("adminId")int id,@RequestBody Admin admin)
	{
		return new ResponseEntity<Admin>(adminservice.updateAdmin(id, admin),HttpStatus.OK);
	}
	
}
