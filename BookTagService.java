package com.example.backend;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookTagService {

	@Autowired
	private IBookTagRepository repo;
	
	public Optional<BookTag> getById(Long id)
	{
		return repo.findById(id);
	}
	
	public List<BookTag> getAll()
	{
		return repo.findAll();
	}
	
	public void create(BookTag bookTag)
	{
		repo.save(bookTag);
	}
	
	public void deleteById(Long id)
	{
		repo.deleteById(id);
	}
}