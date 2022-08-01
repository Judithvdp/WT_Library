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
public class TagController {

	@Autowired
	private TagService service;
	
	@RequestMapping(value = "tag/getbyid/{id}")
	public Optional<Tag> getById(@PathVariable long id)
	{
		return service.getById(id);
	}
	
	@RequestMapping(value="tag/getall")
	public List<Tag> getAll()
	{
		return service.getAll();
	}
	
	@PostMapping("tag/create")
	public boolean create(@RequestBody Tag tag)
	{ 
		service.create(tag);
		return true;
	}
	
	@DeleteMapping(value = "tag/deletebyid/{id}")
	public boolean deleteById(@PathVariable long id)
	{ 
		service.deleteById(id);
		return true;
	}
}
