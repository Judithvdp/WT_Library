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
public class ReservationController {

	@Autowired
	private ReservationService service;
	
	@RequestMapping(value = "reservation/getbyid/{id}")
	public Optional<Reservation> getById(@PathVariable long id)
	{
		return service.getById(id);
	}
	
	@RequestMapping(value="reservation/getall")
	public List<Reservation> getAll()
	{
		return service.getAll();
	}
	
	@PostMapping("reservation/create")
	public boolean create(@RequestBody Reservation reservation)
	{ 
		service.create(reservation);
		return true;
	}
	
	@DeleteMapping(value = "reservation/deletebyid/{id}")
	public boolean deleteById(@PathVariable long id)
	{ 
		service.deleteById(id);
		return true;
	}
}
