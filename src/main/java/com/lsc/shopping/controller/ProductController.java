package com.lsc.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lsc.shopping.model.Product;
import com.lsc.shopping.service.ProductService;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Product> products() {
		return service.findAll();
	}
	
}
