package sn.ucad.m2sir.enties;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="reservation")
public class Reservation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id_reservation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_client", insertable = true, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Client client;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_voiture", insertable = true, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Voiture voiture;

	
	@Column(name="debut_reservation")
	private String debut_reservation;
	
	@Column(name="fin_reservation")
	private String fin_reservation;
	
	@Column(name="prix_total")
	private Long prix_total;
	
	@Column(name="chauffeur")
	private String chauffeur;

	
	
	public Reservation(int id_reservation, Client client, Voiture voiture, String debut_reservation,
			String fin_reservation, Long prix_total, String chauffeur) {
		super();
		this.id_reservation = id_reservation;
		this.client = client;
		this.voiture = voiture;
		this.debut_reservation = debut_reservation;
		this.fin_reservation = fin_reservation;
		this.prix_total = prix_total;
		this.chauffeur = chauffeur;
	}


	public Reservation() {
		
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public String getDebut_reservation() {
		return debut_reservation;
	}

	public void setDebut_reservation(String debut_reservation) {
		this.debut_reservation = debut_reservation;
	}

	public String getFin_reservation() {
		return fin_reservation;
	}

	public void setFin_reservation(String fin_reservation) {
		this.fin_reservation = fin_reservation;
	}

	public Long getPrix_total() {
		return prix_total;
	}

	public void setPrix_total(Long prix_total) {
		this.prix_total = prix_total;
	}


	public int getId_reservation() {
		return id_reservation;
	}


	public void setId_reservation(int id_reservation) {
		this.id_reservation = id_reservation;
	}


	public String getChauffeur() {
		return chauffeur;
	}


	public void setChauffeur(String chauffeur) {
		this.chauffeur = chauffeur;
	}
	
	
	
	
}
