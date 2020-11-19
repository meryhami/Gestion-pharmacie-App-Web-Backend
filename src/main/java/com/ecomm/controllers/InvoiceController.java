package com.ecomm.controllers;

import com.ecomm.dao.InvoiceRep;
import com.ecomm.entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name="/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceRep invoiceRep;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/invoice")
    public List<Invoice> getInvoice()
    {
        return invoiceRep.findAll();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/invoice")
    public Invoice save(@RequestBody Invoice p)
    {
        return invoiceRep.save(p);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/invoice/{id}")
    public Invoice getProduits(@PathVariable(name ="id") Long id)
    {
        return  invoiceRep.findById(id).get();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(value = "/invoice/{id}")
    public Invoice Update(@PathVariable(name ="id") Long id, @RequestBody Invoice p)
    {
        p.setId(id);

        return invoiceRep.save(p);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value = "/invoice/{id}")
    public void delete(@PathVariable(name ="id") Long id)
    {

        invoiceRep.deleteById(id);
    }


}
