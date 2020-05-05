package sn.ucad.m2sir.enties;

import java.io.Serializable;
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
@Table(name="voiture")
public class Voiture implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id_voiture;
    
    @Column(name="model")
	private String model;
    
    @Column(name="marque")
    private String marque;
    
    @Column(name="description")
    private String description;
    
    @Column(name="nbre_porte")
    private int nbre_porte ;
    
    @Column(name="prix_jour")
    private Long prix_jour;
    
    @Column(name="stock")
    private int stock;
    
    
    @OneToMany(targetEntity = Images.class, mappedBy = "id_image", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<Images> images;


	public Voiture() {
	}


	public Voiture(int id_voiture, String model, String marque, String description, int nbre_porte, Long prix_jour,
			int stock) {
		super();
		this.id_voiture = id_voiture;
		this.model = model;
		this.marque = marque;
		this.description = description;
		this.nbre_porte = nbre_porte;
		this.prix_jour = prix_jour;
		this.stock = stock;
	}


	public int getId_voiture() {
		return id_voiture;
	}


	public void setId_voiture(int id_voiture) {
		this.id_voiture = id_voiture;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getNbre_porte() {
		return nbre_porte;
	}


	public void setNbre_porte(int nbre_porte) {
		this.nbre_porte = nbre_porte;
	}


	public Long getPrix_jour() {
		return prix_jour;
	}


	public void setPrix_jour(Long prix_jour) {
		this.prix_jour = prix_jour;
	}
	


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	

	    
	

	

}
