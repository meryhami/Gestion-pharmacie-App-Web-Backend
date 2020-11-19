package com.ecomm.controllers;

import com.ecomm.dao.CustmerRep;
import com.ecomm.entities.CustmerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name="/CustmerInfo")
public class CustmerController {
    @Autowired
    CustmerRep custmerRep;


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/custmer",method = RequestMethod.POST)
    public CustmerInfo save(@RequestBody CustmerInfo p)
    {
        return custmerRep.save(p);
    }

}
