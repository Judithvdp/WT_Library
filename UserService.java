package com.example.backend;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private IUserRepository repo;
	
	public Optional<User> getById(Long id)
	{
		return repo.findById(id);
	}
	
	public List<User> getAll()
	{
		return repo.findAll();
	}
	
	public void create(User user)
	{
		repo.save(user);
	}
	
	public boolean login(LoginCredential loginCredential)
	{
		return true;
	}
	
	public void deleteById(Long id)
	{
		repo.deleteById(id);
	}
}