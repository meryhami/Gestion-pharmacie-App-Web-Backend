package com.ecomm.controllers;

import com.ecomm.dao.favorisRep;
import com.ecomm.entities.favoris;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class favoriesController {

    @Autowired
    private favorisRep favorisRep;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value ="/favoris",method = RequestMethod.GET)
    public List<favoris> getwishList()
    {

        return favorisRep.findAll();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/favoris/{idp}",method = RequestMethod.POST)
    public favoris save(@RequestBody favoris p,@PathVariable Long idp)
    {
        p.setId(idp);
        return favorisRep.save(p);
    }


    @DeleteMapping(value = "/favoris/{id}")
    public void delete(@PathVariable Long id)
    {

        favorisRep.deleteById(id);

    }
}
