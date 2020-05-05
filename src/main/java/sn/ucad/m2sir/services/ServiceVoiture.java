package sn.ucad.m2sir.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.ucad.m2sir.enties.VoitImsDto;
import sn.ucad.m2sir.enties.Voiture;
import sn.ucad.m2sir.repository.VoitureRepo;

@Service
public class ServiceVoiture {
 
	@Autowired
	VoitureRepo voitureRepo;
	public List<VoitImsDto> listVoitures(){
		return  voitureRepo.fetchVoitureImages();
	}
	
	public VoitImsDto getOneVoiture(int id) {		
		return voitureRepo.getVoitureImages(id);
	}
	
	public Voiture getVoiture(int id) {		
		return voitureRepo.getVoiture(id);
	}
public List<String[]>getModeles() {		
		return voitureRepo.getModeles();
	}

	
//	public Voiture updateStockVoiture(int id) {		
//		return voitureRepo.updateStockVoiture(id);
//	}
	
	public Voiture saveVoiture(Voiture newVoiture) {	
		return voitureRepo.save(newVoiture);
	}
//	public void updateHbt(Voiture hbt) {	
//		 habitatRepo.update(hbt);
//	}
	
	public void delete(Voiture newVoiture) {
		voitureRepo.delete(newVoiture);
	}
	
}
