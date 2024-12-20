package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
	public ProductController() {
		System.out.println("ProductController");
	}
	
	@GetMapping("/getProduct")
	public ResponseEntity<List<Product>> getAll()
	{System.out.println("ProductController1");
		List<Product> plist=pservice.getAll();
		return ResponseEntity.ok(plist);
	}
	
	@GetMapping("/getProduct/{pid}")
	public ResponseEntity <Product>getById(@PathVariable int pid)
	{
		Product p=pservice.getById(pid);
		return ResponseEntity.ok(p);
	}
	
	@PostMapping("/getProduct/{pid}")
	public ResponseEntity<String> addNewProduct(@RequestBody Product p){
		boolean status=pservice.addNewProduct(p);
		if(status) {
		   return ResponseEntity.ok("Added");
		}else
		{
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/getProduct/{pid}")
	public ResponseEntity<String> deleteById(@PathVariable int pid){
		boolean status=pservice.deleteById(pid);
		if(status) {
			return ResponseEntity.ok("Deleted");
		}else
		{
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/getProduct/{pid}")
	public ResponseEntity<String> updateById(@RequestBody Product p){
		boolean Status=pservice.updateById(p);
		if(Status) {
			return ResponseEntity.ok("Updated");
		}else
		{
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		
	}
}
