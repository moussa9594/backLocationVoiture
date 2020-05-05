package sn.ucad.m2sir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.ucad.m2sir.enties.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client , Integer> {
	
	@Query("FROM Client c where c.id_client = ?1")
	Client getClient(int id_client);
	
	@Query("FROM Client c where c.telephone = ?1")
	Client getClientByTel(Long tel);

}
