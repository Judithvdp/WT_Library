package com.example.backend;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private IBookRepository repo;
	
	public Optional<Book> getById(Long id)
	{
		return repo.findById(id);
	}
	
	public List<Book> getAll()
	{
			return repo.findAll();
	}
	
	public void create(Book book)
	{
		repo.save(book);
	}
	
	public void deleteById(Long id)
	{
		repo.deleteById(id);
	}
	
}
