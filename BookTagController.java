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
public class BookTagController {

	@Autowired
	private BookTagService service;
	
	@RequestMapping(value = "booktag/getbyid/{id}")
	public Optional<BookTag> getById(@PathVariable long id)
	{
		return service.getById(id);
	}
	
	@RequestMapping(value="bookTag/getall")
	public List<BookTag> getAll()
	{
		return service.getAll();
	}
	
	@PostMapping("bookTag/create")
	public boolean create(@RequestBody BookTag bookTag)
	{ 
		service.create(bookTag);
		return true;
	}
	
	@DeleteMapping(value = "bookTag/deletebyid/{id}")
	public boolean deleteById(@PathVariable long id)
	{ 
		service.deleteById(id);
		return true;
	}
}
