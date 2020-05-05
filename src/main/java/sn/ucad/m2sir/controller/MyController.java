package sn.ucad.m2sir.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.ucad.m2sir.enties.Client;
import sn.ucad.m2sir.enties.Images;
import sn.ucad.m2sir.enties.Reservation;
import sn.ucad.m2sir.enties.VoitImsDto;
import sn.ucad.m2sir.enties.Voiture;
import sn.ucad.m2sir.services.ServiceClient;
import sn.ucad.m2sir.services.ServiceImage;
import sn.ucad.m2sir.services.ServiceReservation;
import sn.ucad.m2sir.services.ServiceVoiture;

@CrossOrigin( value="*" )
@RestController
public class MyController {

	// ********************* debut controlleur pour voiture ********************	
			@Autowired
			ServiceVoiture sv;
			
			@GetMapping("/voitureAndIms/{id_voiture}")
			public VoitImsDto getVoitureIms(@PathVariable( value="id_voiture" ) int id_voiture) {
				return sv.getOneVoiture(id_voiture);
			}
			
			@GetMapping("/voiture/{id_voiture}")
			public Voiture getVoiture(@PathVariable( value="id_voiture" ) int id_voiture) {
				return sv.getVoiture(id_voiture);
			}

		@GetMapping("/getModeles")
			public List<String[]> getModeles() {
				return sv.getModeles();
			}
			
//			@GetMapping("/updateStockVoiture/{id_voiture}")
//			public Voiture updateStockVoiture(@PathVariable( value="id_voiture" ) int id_voiture) {
//				return sv.updateStockVoiture(id_voiture);
//			}
			
			@GetMapping("/voituresAndIms")
			public List listVoitures() {
				return sv.listVoitures();
			}
			
			@PostMapping("/creerVoiture")
			    public Voiture createVoiture(@Valid @RequestBody Voiture newVoiture) {
			        return sv.saveVoiture(newVoiture);
			    }
			@GetMapping("/supprimerVoiture/{id_voiture}")
			public Map<String, Boolean> supprimerVoiture(@PathVariable( value="id_voiture" ) int id_voiture) {
				Voiture getVoiture = sv.getVoiture(id_voiture);
				sv.delete(getVoiture);
				Map<String, Boolean> response = new HashMap<>();
				response.put("deleted", Boolean.TRUE);
				return response;
			}
			// ********************* fin controlleur pour voiture ********************	
		
		// ********************* debut controlleur pour client ********************	
			@Autowired
			ServiceClient sc;
			
			@GetMapping("/getClient/{id_client}")
			public Client getClient(@PathVariable( value="id_client" ) int id_client) {
				return sc.getClient(id_client);
			}
			
			@GetMapping("/getClientByTel/{tel}")
			public Client getClientByTel(@PathVariable( value="tel" ) Long tel) {
				return sc.getClientByTel(tel);
			}
			
			
			@GetMapping("/listClients")
			public List<Client> listClients() {
				return sc.listClients();
			}
			
			@PostMapping("/creerClient")
			    public Client createClient(@Valid @RequestBody Client newClient) {
			        return sc.saveClient(newClient);
			    }
			@GetMapping("/supprimerClient/{id_client}")
			public Map<String, Boolean> supprimerClient(@PathVariable( value="id_client" ) int id_client) {
				Client getClient = sc.getClient(id_client);
				sc.delete(getClient);
				Map<String, Boolean> response = new HashMap<>();
				response.put("deleted", Boolean.TRUE);
				return response;
			}
			// ********************* fin controlleur pour client ********************	
			
		// ********************* debut controlleur pour reservation ********************	
		@Autowired
		ServiceReservation sr;
		
		@GetMapping("/getReservation/{id_reservation}")
		public Reservation getReservation(@PathVariable( value="id_reservation" ) int id_reservation) {
			return sr.getReservation(id_reservation);
		}
		
		@GetMapping("/listReservations")
		public List<Reservation> listReservations() {
			return sr.listReservations();
		}
		
		@PostMapping("/creerReservation")
		public Reservation createReservation(@Valid @RequestBody Reservation newReservation) {
			return sr.saveReservation(newReservation);
		}
		@GetMapping("/supprimerReservation/{id_reservation}")
		public Map<String, Boolean> supprimerReservation(@PathVariable( value="id_reservation" ) int id_reservation) {
			Reservation getReservation = sr.getReservation(id_reservation);
			sr.delete(getReservation);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return response;
		}
		// ********************* fin controlleur pour reservation ********************	
		
		// ********************* debut controlleur pour images ********************
		@Autowired
		ServiceImage si;
		
		@PostMapping("/creerImages")
	    public Images createImages(@Valid @RequestBody Images newImages) {
	        return si.saveImages(newImages);
	    }

	    @GetMapping("/getImages/{id_voiture}")
		public Images getImages (@PathVariable( value="id_voiture" ) int id_voiture) {
			return si.getImages(id_voiture);
		}


	    @GetMapping("/supprimerImages/{id_voiture}")
	    public Map<String, Boolean> supprimerImages(@PathVariable( value="id_voiture" ) int id_voiture) {
	      Images getImages = si.getImages(id_voiture);
	      si.delete(getImages);
	      Map<String, Boolean> response = new HashMap<>();
	      response.put("deleted", Boolean.TRUE);
		return response;
			}

		
		
		// ********************* debut controlleur pour images ********************
		
	
	
	
}
