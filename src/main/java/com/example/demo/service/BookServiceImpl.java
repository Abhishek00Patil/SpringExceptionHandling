package com.example.demo.service;



import org.springframework.stereotype.Service;

import com.example.demo.exception.NoBookFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Double findByBookId(String bookId) {
		
		if(bookId.equals("B101")) {
		return 450.00;
		}
		else {
			throw new NoBookFoundException("No Book Find by Given ID..");
		}
	}

}
