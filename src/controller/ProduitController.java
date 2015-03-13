package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import services.ProduitMetier;
import dao.Produit;

@Controller
public class ProduitController {
	
	@Autowired
	ProduitMetier services;
	
	//index.jsp
	@RequestMapping(value="/searchById")
	public String pageIndex(Model model){
		//traittement...
		model.addAttribute("listeProduit", services.getAllProduits());
		services.getAllProduits();
		return "produits";
		//Pages/produit.jsp
	}
	
	@RequestMapping(value="/index")
	public String searchById(Model model, @RequestParam(value="idProduit") Long id){
		List<Produit> liste = new ArrayList<Produit>();
		liste.add(services.getProduitById(id));
		model.addAttribute("listeProduit", liste);
		model.addAttribute("idProduit", id);
		
		return "produits";
	}
	
	//addProduit.jsp
	/*
	 * @RequestParam String nom,
	   @RequestParam String description,
	   @RequestParam Long prix
	 */
	@RequestMapping(value="/addProduit")
	public String addProduit(Model model,@RequestParam Produit p){
		
		//Produit p = new Produit(nom, description, prix);
		services.addProduit(p);
		model.addAttribute("listeProduit", services.getAllProduits());
		return "produits";
	}
	
	//deleteProduit.jsp
	//passer un objet en parametre.
	@RequestMapping(value="/deleteProduit")
	public String deleteProduit(Model model, @RequestParam Long id){
		services.deleteProduit(id);
		model.addAttribute("listeProduit", services.getAllProduits());
		return "produits";
	}

}