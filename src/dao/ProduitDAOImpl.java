package dao;

import java.util.ArrayList;
import java.util.List;

public class ProduitDAOImpl implements ProduitDAO {
	
	private List<Produit> produits = new ArrayList<Produit>();
	
	public void init(){
		System.out.println("www.epi.com");
		
		addProduit(new Produit("PC 1", "Sony vaio 1",(long) 7000.0));
		addProduit(new Produit("PC 2", "Sony vaio 2",(long) 6000.0));
		addProduit(new Produit("PC 3", "Sony vaio 3",(long) 8000.0));
		addProduit(new Produit("PC 4", "Sony vaio 4",(long) 9000.0));
		addProduit(new Produit("PC 5", "Sony vaio 5",(long) 4000.0));
		addProduit(new Produit("PC 6", "Sony vaio 6",(long) 8500.0));
		addProduit(new Produit("PC 7", "Sony vaio 7",(long) 3000.0));
		
	}

	@Override
	public void addProduit(Produit produit) {
		produit.setIdProduit(new Long(produits.size()+1));
		produits.add(produit);
	}

	@Override
	public void deleteProduit(Long idProduit) {
		produits.remove(getProduitById(idProduit));
	}

	@Override
	public Produit getProduitById(Long idProduit) {
		Produit produit = null;
		for(Produit p : produits){
			if(p.getIdProduit().equals(idProduit)){
				produit = p;
				break;
			}
		}
		return produit;
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void updateProduit(Produit produit) {
		// TODO Auto-generated method stub

	}

}
