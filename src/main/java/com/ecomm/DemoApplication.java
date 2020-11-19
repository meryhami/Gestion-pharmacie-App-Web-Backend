package com.ecomm;


import com.ecomm.dao.CategorieRep;
import com.ecomm.dao.ProduitRep;
import com.ecomm.dao.ProjectionRep;
import com.ecomm.dao.InvoiceRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CategorieRep categorieRep;
	@Autowired
	private ProduitRep produitRep;
	@Autowired
	private InvoiceRep s;
	@Autowired
	private ProjectionRep projectionRep;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {













	}
}
