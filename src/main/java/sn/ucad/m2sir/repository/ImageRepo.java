package sn.ucad.m2sir.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ucad.m2sir.enties.Images;

@Repository
public interface ImageRepo extends JpaRepository<Images , Integer> {

@Query(" FROM Images i where i.voiture.id_voiture = ?1 ")
Images getImages(int id_voiture);
	
	

}
