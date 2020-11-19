package com.ecomm.dao;

import com.ecomm.entities.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProduitRep extends JpaRepository<Produits, Long> {



    List<Produits> findByCategorie(String categorie);
}
