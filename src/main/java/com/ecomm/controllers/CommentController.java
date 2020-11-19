package com.ecomm.controllers;

import com.ecomm.dao.CommentsRep;
import com.ecomm.dao.ProduitRep;
import com.ecomm.entities.Comments;
import com.ecomm.entities.Produits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name="/comments")

public class CommentController {
    @Autowired
    ProduitRep produitRep;
    @Autowired
    CommentsRep commentsRep;

    @CrossOrigin(origins = "http://localhost:4200")

    @RequestMapping(value = "/comment/add/{idc}",method = RequestMethod.POST)
    public  void addComment (@RequestBody Comments comments, @PathVariable Long idc)
    {
        Produits produits= new Produits();
        produits.setId(idc);
        comments.setProduits(produits);
        commentsRep.save(comments);

    }

}
