package com.ecomm.dao;

import com.ecomm.entities.Orders;
import com.ecomm.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource

public interface OrdersRep extends JpaRepository<Orders,Long> {
    List<Orders> findByUseridAndInvoice(String userid , Invoice invoice);
}
