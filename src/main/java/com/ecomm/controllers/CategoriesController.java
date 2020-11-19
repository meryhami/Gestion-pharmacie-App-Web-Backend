package com.ecomm.controllers;

import com.ecomm.dao.CategorieRep;
import com.ecomm.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name="/categories")
public class CategoriesController {
    @Autowired
    private CategorieRep categorieRep;



    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/categorie")
    public List<Categories>getCategories()
    {
        return categorieRep.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value = "/caterogry/{id}")
    public void delete(@PathVariable(name ="id") Long id)
    {

        categorieRep.deleteById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/category",method = RequestMethod.POST)
    public Categories save(@RequestBody Categories p)
    {
        return categorieRep.save(p);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value ="/categorie/{id}",method = RequestMethod.GET)
    public Categories getcategorie(@PathVariable(name ="id") Long id)
    {
        return  categorieRep.findById(id).get();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/categorie/{id}",method = RequestMethod.PUT)
    public Categories Update(@PathVariable(name ="id") Long id,@RequestBody Categories p)
    {
        p.setId(id);

        return categorieRep.save(p);
    }


}
