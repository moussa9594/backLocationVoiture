package sn.ucad.m2sir.enties;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id_client;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="sexe")
	private String sexe;
	
	@Column(name="telephone")
	private Long telephone;
	
	@Column(name="date_naissance")
	private Date date_naissance;
	
	
	public Client(int id_client, String prenom, String nom, String sexe, Long telephone, Date date_naissance) {
		super();
		this.id_client = id_client;
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
		this.telephone = telephone;
		this.date_naissance = date_naissance;
	}
	public Client() {
		
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	
	
	
	

}
