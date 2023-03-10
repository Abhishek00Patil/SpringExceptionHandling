package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(value = "/findPriceById")
	public String getPrieById(@RequestParam ("bookId") String bookId,Model model)
	{
		Double bookPrice = bookService.findByBookId(bookId);
		
		model.addAttribute("price", "Book price:: " + bookPrice);
		
		return "display";
	}

}
