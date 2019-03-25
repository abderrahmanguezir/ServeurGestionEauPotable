package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Produit;
import com.example.demo.service.IProduitService;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {
    @Autowired
	private IProduitService produitService;
    
    @GetMapping
    public List<Produit> getProduits(){
    	return produitService.getProduits();
    	
    }
}
