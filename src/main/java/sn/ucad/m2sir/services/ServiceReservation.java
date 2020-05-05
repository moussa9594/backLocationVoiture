package sn.ucad.m2sir.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.ucad.m2sir.enties.VoitImsDto;
import sn.ucad.m2sir.enties.Reservation;
import sn.ucad.m2sir.repository.ReservationRepo;

@Service
public class ServiceReservation {
 
	@Autowired
	ReservationRepo voitureRepo;
	public List<Reservation> listReservations(){
		return  voitureRepo.findAll();
	}
		
	public Reservation getReservation(int id) {		
		return voitureRepo.getReservation(id);
	}
	
	public Reservation saveReservation(Reservation newReservation) {	
		return voitureRepo.save(newReservation);
	}
	
	public void delete(Reservation newReservation) {
		voitureRepo.delete(newReservation);
	}
	
}
