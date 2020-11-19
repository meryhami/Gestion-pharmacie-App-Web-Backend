package com.ecomm.dao;

import com.ecomm.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InvoiceRep extends JpaRepository<Invoice, Long> {


}
