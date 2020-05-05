package sn.ucad.m2sir.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.ucad.m2sir.enties.VoitImsDto;
import sn.ucad.m2sir.enties.Images;
import sn.ucad.m2sir.repository.ImageRepo;

@Service
public class ServiceImage {
 
	@Autowired
	ImageRepo imageRepo;
	
	public Images saveImages(Images newImages) {	
		return imageRepo.save(newImages);
	}
	public void delete(Images newImages) {
		imageRepo.delete(newImages);
	}

public Images getImages(int id_voiture) {
		return imageRepo.getImages(id_voiture);
	}
	
}
