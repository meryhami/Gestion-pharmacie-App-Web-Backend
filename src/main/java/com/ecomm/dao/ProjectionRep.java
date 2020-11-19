package com.ecomm.dao;

import com.ecomm.dto.PrdtprojDto;
import com.ecomm.entities.Produits;
import com.ecomm.entities.Projections;
import com.ecomm.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import java.util.List;
@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "Projections", path = "projections")
@Transactional
public interface ProjectionRep extends JpaRepository<Projections,Long> {

    List <Projections> findByProduitsAndInvoice(Produits produits , Invoice invoice);
    List <Projections> findByInvoice(Invoice invoice);
    @Query("select t.quantity from Projections t where t.produits = ?1 and t.invoice = ?2")
    List<Integer> findquantity(Produits produits , Invoice invoice);
    @Query("select SUM(t.quantity)" +
            " from Projections t where  t.invoice = ?1")
    int countItems(Invoice invoice);

    @Query("select t.produits from Projections t where  t.invoice = ?1")
    List<Produits> getProduits(Invoice invoice);



    @Query("SELECT new com.ecomm.dto.PrdtprojDto(p.id,p.title,pd.quantity,p.price,p.imageUrl) "
            + "FROM Produits p INNER JOIN p.projections pd where pd.invoice = ?1")
    List<PrdtprojDto> fetchprojPrdtDataInnerJoin(Invoice invoice);

    void deleteByInvoice(Invoice invoice);


}
