package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.NoProductFoundException;
import com.example.demo.model.Product;



@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public Product findProductById(Integer pid) {
		
		if(pid==101) {
			return new Product("101", "Keyboard", 550.00);
		}
		else {
			throw new NoProductFoundException("No Product Found");
		}
		
	}

	

}
