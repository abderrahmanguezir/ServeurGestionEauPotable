package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
@Service
public class ProduitMockServiceImpl implements IProduitService{
    
	private List<Produit> produits;
	
	public ProduitMockServiceImpl(){
		produits = new ArrayList<Produit>();
		produits.add(new Produit("Livre", 50, 200));
		produits.add(new Produit("stylo", 120, 30));
		produits.add(new Produit("cahier", 70, 450));
				
		
	}
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void deleteProduit(String ref) {
		Produit produit = new Produit();
		produit.setRef(ref);
		produits.remove(produit);
		
	}

}
