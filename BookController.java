package com.example.backend;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
public class BookController 
{
	@Autowired
	private BookService service;
	
	@RequestMapping(value = "book/getbyid/{id}")
	public Optional<Book> getById(@PathVariable long id)
	{
		return service.getById(id);
	}
	
	@RequestMapping(value="book/getall")
	public List<Book> getAll()
	{
		return service.getAll();
	}
	
	@PostMapping("book/create")
	public boolean create(@RequestBody Book book)
	{ 
		service.create(book);
		return true;
	}
	
	@DeleteMapping(value = "book/deletebyid/{id}")
	public boolean deleteById(@PathVariable long id)
	{ 
		service.deleteById(id);
		return true;
	}
}
