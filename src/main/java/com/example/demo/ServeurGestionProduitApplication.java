package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Produit;

@SpringBootApplication
public class ServeurGestionProduitApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx= SpringApplication.run(ServeurGestionProduitApplication.class, args);
		 ProduitRepository pr=ctx.getBean(ProduitRepository.class);
		 pr.save(new Produit("livre",33,300));
		 pr.save(new Produit("stvlo",3,90));
		 
	}

}
