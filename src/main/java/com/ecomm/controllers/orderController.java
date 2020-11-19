package com.ecomm.controllers;

import com.ecomm.dao.ProduitRep;
import com.ecomm.dao.ProjectionRep;
import com.ecomm.dao.InvoiceRep;
import com.ecomm.dto.PrdtprojDto;
import com.ecomm.entities.Invoice;
import com.ecomm.entities.Produits;
import com.ecomm.entities.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class orderController {
    @Autowired
    ProduitRep produitRep;
    @Autowired
    InvoiceRep invoiceRep;
    @Autowired
    ProjectionRep projectionRep;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/projections")
    public List<Projections> getProduits()
    {
        return projectionRep.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/projections/{idp}/{ids}")
    public Projections save(@PathVariable Long idp,@PathVariable Long ids,@RequestBody Projections p)
    {
        Produits produits= new Produits();
        produits.setId(idp);
        Invoice s=new Invoice();
        s.setId(ids);
        p.setProduits(produits);
        p.setInvoice(s);
        return projectionRep.save(p);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/projections/{produits}/{invoice}")
    public List<Projections> findbyproduits(@PathVariable Produits produits,@PathVariable Invoice invoice)
    {
        return projectionRep.findByProduitsAndInvoice(produits, invoice);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/projections/{invoice}")
    public List<Projections> findbyInvoice(@PathVariable Invoice invoice)
    {
        return projectionRep.findByInvoice(invoice);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/projections/q/{produits}/{invoice}")
    public List<Integer> findquantity(@PathVariable Produits produits,@PathVariable Invoice invoice)
    {
        return projectionRep.findquantity(produits, invoice);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/projections/{id}/{produits}/{invoice}",method = RequestMethod.PUT)
    public Projections Update(@PathVariable Long id, @PathVariable Produits produits, @PathVariable Invoice invoice, @RequestBody Projections p)
    {
        p.setId(id);
        p.setProduits(produits);
        p.setInvoice(invoice);

        return projectionRep.save(p);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/projections/count/{invoice}")
    public int countItems(@PathVariable Invoice invoice)
    {
        return  projectionRep.countItems(invoice);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/projections/produit/{invoice}")
    public List<Produits> getProduits(@PathVariable Invoice invoice)
    {
        return  projectionRep.getProduits(invoice);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/projections/produit/m/{invoice}")
    List<PrdtprojDto> fetchprojPrdtDataInnerJoin(@PathVariable Invoice invoice)
    {
        return projectionRep.fetchprojPrdtDataInnerJoin(invoice);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value = "/projections/{invoice}")
    void clearshoppincart(@PathVariable Invoice invoice)
    {

        projectionRep.deleteByInvoice(invoice);
    }








}
