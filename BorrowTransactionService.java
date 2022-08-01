package com.example.backend;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowTransactionService {

	@Autowired
	private IBorrowTransactionRepository repo;
	
	public Optional<BorrowTransaction> getById(Long id)
	{
		return repo.findById(id);
	}
	
	public List<BorrowTransaction> getAll()
	{
		return repo.findAll();
	}
	
	public void create(BorrowTransaction borrowTransaction)
	{
		repo.save(borrowTransaction);
	}
	
	public void deleteById(Long id)
	{
		repo.deleteById(id);
	}
}