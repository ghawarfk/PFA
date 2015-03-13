package dao;

import java.util.List;

public interface ProduitDAO {
	
	public void addProduit(Produit produit);
	public void deleteProduit(Long idProduit);
	public Produit getProduitById(Long idProduit);
	public List<Produit> getAllProduits();
	public void updateProduit(Produit produit);
}
