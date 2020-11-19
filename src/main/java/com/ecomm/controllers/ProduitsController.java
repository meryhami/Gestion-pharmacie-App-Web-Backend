package com.ecomm.controllers;

import com.ecomm.dao.ProduitRep;
import com.ecomm.entities.Produits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(name="/produits")

public class ProduitsController {

        @Autowired
        private ProduitRep produitRep;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value ="/produits",method = RequestMethod.GET)
        public List<Produits> getProduits()
        {

            return produitRep.findAll();
        }


       @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/produits",method = RequestMethod.POST)
    public Produits save(@RequestBody Produits p)
    {
        return produitRep.save(p);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value ="/produits/{id}",method = RequestMethod.GET)
    public Produits getProduits(@PathVariable(name ="id") Long id)
    {
        return  produitRep.findById(id).get();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/produits/{id}",method = RequestMethod.PUT)
    public Produits Update(@PathVariable(name ="id") Long id,@RequestBody Produits p)
    {
        p.setId(id);

        return produitRep.save(p);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value = "/produits/{id}")
    public void delete(@PathVariable(name ="id") Long id)
    {

         produitRep.deleteById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value ="/produits/cat/{c}",method = RequestMethod.GET)
    public List<Produits>getProduitsbycategorie(@PathVariable String c)
    {
        return  produitRep.findByCategorie(c);
    }




}
