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
@Table(name="images")
public class Images implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id_image;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_voiture", insertable = true, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Voiture voiture;
    
	@Column(name="image1")
	private String image1;
	
	@Column(name="image2")
	private String image2;
	
	@Column(name="image3")
	private String image3;

	public Images(int id_image, Voiture voiture, String image1, String image2, String image3) {
		super();
		this.id_image = id_image;
		this.voiture = voiture;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}
	
	public Images() {
		
	}

	public int getId_image() {
		return id_image;
	}

	public void setId_image(int id_image) {
		this.id_image = id_image;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
