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
public class PrintController {

	@Autowired
	private PrintService service;
	
	@RequestMapping(value = "print/getbyid/{id}")
	public Optional<Print> getById(@PathVariable long id)
	{
		return service.getById(id);
	}
	
	@RequestMapping(value="print/getall")
	public List<Print> getAll()
	{
		return service.getAll();
	}
	
	@PostMapping("print/create")
	public boolean create(@RequestBody Print print)
	{ 
		service.create(print);
		return true;
	}
	
	@DeleteMapping(value = "print/deletebyid/{id}")
	public boolean deleteById(@PathVariable long id)
	{ 
		service.deleteById(id);
		return true;
	}
}
