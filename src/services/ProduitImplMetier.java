package services;

import java.util.List;

import dao.Produit;
import dao.ProduitDAO;

public class ProduitImplMetier implements ProduitMetier {
	
	private ProduitDAO dao;

	@Override
	public void addProduit(Produit produit) {
		dao.addProduit(produit);

	}

	@Override
	public void deleteProduit(Long idProduit) {
		dao.deleteProduit(idProduit);

	}

	@Override
	public Produit getProduitById(Long idProduit) {
		return dao.getProduitById(idProduit);
	}

	@Override
	public List<Produit> getAllProduits() {
		return dao.getAllProduits();
	}

	public void setDao(ProduitDAO dao) {
		this.dao = dao;
	}
	
}
