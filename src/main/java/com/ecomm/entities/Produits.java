package com.ecomm.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data

@AllArgsConstructor @ToString @NoArgsConstructor
public class Produits implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String title ;
    private double price;
    private String categorie;
    private String  imageUrl;
    private String description;
    private  int likes;
    @OneToMany(mappedBy = "produits", fetch = FetchType.EAGER)
    private List<Comments>comments;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public List<Projections> getProjections() {
        return projections;
    }

    public void setProjections(List<Projections> projections) {
        this.projections = projections;
    }

    @OneToMany(mappedBy = "produits",cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JsonIgnore
    List<Projections> projections;
}
