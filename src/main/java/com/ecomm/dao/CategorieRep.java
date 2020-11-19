package com.ecomm.dao;

import com.ecomm.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRep extends JpaRepository<Categories, Long> {
}
