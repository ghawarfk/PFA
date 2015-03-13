package services;

import java.util.List;

import dao.Produit;

public interface ProduitMetier {
	
	public void addProduit(Produit produit);
	public void deleteProduit(Long idProduit);
	public Produit getProduitById(Long idProduit);
	public List<Produit> getAllProduits();
	
}
