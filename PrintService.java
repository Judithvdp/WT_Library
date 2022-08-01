package com.example.backend;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintService {

	@Autowired
	private IPrintRepository repo;
	
	public Optional<Print> getById(Long id)
	{
		return repo.findById(id);
	}
	
	public List<Print> getAll()
	{
		return repo.findAll();
	}
	
	public void create(Print print)
	{
		repo.save(print);
	}
	
	public void deleteById(Long id)
	{
		repo.deleteById(id);
	}
}