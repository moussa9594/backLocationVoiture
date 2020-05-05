package sn.ucad.m2sir.enties;

public class VoitImsDto {

	private int id_voiture;
	private String marque;
	private String model;
	private String description;
	private int nbre_porte;
	private Long prix_jour;
	private int stock;
	private String image1;
	private String image2;
	private String image3;
	public VoitImsDto(int id_voiture, String marque, String model, String description, int nbre_porte, Long prix_jour,
			 int stock, String image1, String image2, String image3) {
		super();
		this.id_voiture = id_voiture;
		this.marque = marque;
		this.model = model;
		this.description = description;
		this.nbre_porte = nbre_porte;
		this.prix_jour = prix_jour;
		this.stock = stock;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}
	public int getId_voiture() {
		return id_voiture;
	}
	public void setId_voiture(int id_voiture) {
		this.id_voiture = id_voiture;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	
	
	
}
