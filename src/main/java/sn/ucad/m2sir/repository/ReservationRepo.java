package sn.ucad.m2sir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.ucad.m2sir.enties.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation , Integer> {
	
	@Query("FROM Reservation r where r.id_reservation = ?1")
	Reservation getReservation(int id_reservation);

}
