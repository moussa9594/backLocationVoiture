package sn.ucad.m2sir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sn.ucad.m2sir.enties.VoitImsDto;
import sn.ucad.m2sir.enties.Voiture;

@Repository
public interface VoitureRepo extends JpaRepository<Voiture , Integer> {
	
	@Query("SELECT new sn.ucad.m2sir.enties.VoitImsDto(v.id_voiture, v.marque, v.model, v.description, v.nbre_porte"
			+ ", v.prix_jour, v.stock, i.image1, i.image2, i.image3 ) "
			+ "FROM Voiture v , Images i where v.id_voiture = i.voiture.id_voiture")
	List<VoitImsDto> fetchVoitureImages();


	
	@Query("SELECT new sn.ucad.m2sir.enties.VoitImsDto(v.id_voiture, v.marque, v.model, v.description, v.nbre_porte"
			+ ", v.prix_jour, v.stock, i.image1, i.image2, i.image3 ) "
			+ "FROM Voiture v , Images i where v.id_voiture = i.voiture.id_voiture and v.id_voiture = ?1")
	VoitImsDto getVoitureImages(int id_voiture);
	
	@Query("FROM Voiture v where v.id_voiture = ?1")
	Voiture getVoiture(int id_voiture);

@Query("SELECT v.model, i.image3 FROM Voiture v, Images i where v.id_voiture = i.voiture.id_voiture group by v.model, i.image3  ")
	List<String[]>getModeles();

	
//	@Query("UPDATE Voiture set stock = stock - 1 where id_voiture = ?1")
//	Voiture updateStockVoiture(int id_voiture);

}
