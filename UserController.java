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
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "user/getbyid/{id}")
	public Optional<User> getById(@PathVariable long id)
	{
		return service.getById(id);
	}
	
	@RequestMapping(value="user/getall")
	public List<User> getAll()
	{
		return service.getAll();
	}
	
	@PostMapping("user/create")
	public boolean create(@RequestBody User user)
	{
		service.create(user);
		return true;
	}
	
	@PostMapping("user/login")
	public String login(@RequestBody LoginCredential loginCredential )
	{
		//return service.login(loginCredential);
		return loginCredential.getPassword();
	}
	
	@DeleteMapping(value = "user/deletebyid/{id}")
	public boolean deleteById(@PathVariable long id)
	{
		service.deleteById(id);
		return true;
	}
}
