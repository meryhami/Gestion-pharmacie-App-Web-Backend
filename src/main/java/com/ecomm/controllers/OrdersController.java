package com.ecomm.controllers;

import com.ecomm.dao.OrdersRep;
import com.ecomm.dao.CustmerRep;
import com.ecomm.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name="/Orders")

public class OrdersController {

    @Autowired
    CustmerRep custmerRep;
    @Autowired
    OrdersRep ordersRep;
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/orders/{ids}/{idc}")
    public Orders save(@PathVariable Long ids,@PathVariable Long idc,@RequestBody Orders p)
    {
        CustmerInfo custmerInfo = new CustmerInfo();
        Invoice invoice = new Invoice();

        custmerInfo.setId(ids);

        p.setCustmerInfo(custmerInfo);
        invoice.setId(idc);
        p.setInvoice(invoice);

        return ordersRep.save(p);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/orders/{userid}/{invoice}")
    public List<Orders> findbyuserinvoice(@PathVariable String userid, @PathVariable Invoice invoice)
    {
        return ordersRep.findByUseridAndInvoice(userid, invoice);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value ="/orders")
    public List<Orders> getOrders()
    {
        return ordersRep.findAll();
    }



}
