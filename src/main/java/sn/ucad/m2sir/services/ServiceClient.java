package sn.ucad.m2sir.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.ucad.m2sir.enties.Client;
import sn.ucad.m2sir.repository.ClientRepo;

@Service
public class ServiceClient {
 
	@Autowired
	ClientRepo clientRepo;
	public List<Client> listClients(){
		return  clientRepo.findAll();
	}
	
	
	public Client getClient(int id) {		
		return clientRepo.getClient(id);
	}
	
	public Client getClientByTel(Long tel) {		
		return clientRepo.getClientByTel(tel);
	}
	
	public Client saveClient(Client newClient) {	
		return clientRepo.save(newClient);
	}
	
	public void delete(Client newClient) {
		clientRepo.delete(newClient);
	}
	
}
