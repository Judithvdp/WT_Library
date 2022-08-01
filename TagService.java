package com.example.backend;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

	@Autowired
	private ITagRepository repo;
	
	public Optional<Tag> getById(Long id)
	{
		return repo.findById(id);
	}
	
	public List<Tag> getAll()
	{
		return repo.findAll();
	}
	
	public void create(Tag tag)
	{
		repo.save(tag);
	}
	
	public void deleteById(Long id)
	{
		repo.deleteById(id);
	}
}