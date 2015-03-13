package dao;

public class Produit {
	private Long idProduit;
	private String nom;
	private String description;
	private Long prix;
	
	public Produit() {
		super();
	}

	public Produit(String nom, String description, Long prix) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrix() {
		return prix;
	}

	public void setPrix(Long prix) {
		this.prix = prix;
	}
	
	
}
