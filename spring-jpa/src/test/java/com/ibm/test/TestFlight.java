package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:appctx.xml")
public class TestFlight {
	@Autowired
	private FlightRepository repo;
	
	@Test
	public void testSave() {
		Flight f=new Flight("6E765","Mumbai","Delhi","indigo");
		assertNotNull(repo.save(f));
		
	}
	public void testUpdate() {
		Flight f=new Flight("6E765","Mumbai","Pune","Indigo");
     	assertTrue(repo.update(f));
	}
	@Test
	public void testAllFlights() {
		List<Flight> flights=repo.fetchAll();
		assertNotNull(flights);
		System.out.println(flights);
		
	}
	@Test
	public void saveAll() {
		
	}


}
