package com.example.backend;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired
	private IReservationRepository repo;
	
	public Optional<Reservation> getById(Long id)
	{
		return repo.findById(id);
	}
	
	public List<Reservation> getAll()
	{
		return repo.findAll();
	}
	
	public void create(Reservation reservation)
	{
		repo.save(reservation);
	}
	
	public void deleteById(Long id)
	{
		repo.deleteById(id);
	}
}