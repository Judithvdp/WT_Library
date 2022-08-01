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
public class BorrowTransactionController {

	@Autowired
	private BorrowTransactionService service;
	
	@RequestMapping(value = "borrowtransaction/getbyid/{id}")
	public Optional<BorrowTransaction> getById(@PathVariable long id)
	{
		return service.getById(id);
	}
	
	@RequestMapping(value="borrowtransaction/getall")
	public List<BorrowTransaction> getAll()
	{
		return service.getAll();
	}
	
	@PostMapping("borrowtransaction/create")
	public boolean create(@RequestBody BorrowTransaction borrowTransaction)
	{ 
		service.create(borrowTransaction);
		return true;
	}
	
	@DeleteMapping(value = "borrowtransaction/deletebyid/{id}")
	public boolean deleteById(@PathVariable long id)
	{ 
		service.deleteById(id);
		return true;
	}
}
