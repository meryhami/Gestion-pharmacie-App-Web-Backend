package com.ecomm.dto;

public class PrdtprojDto {
    long id;
    String title;
    int quantity;
    double price;
    String imageUrl;

    public PrdtprojDto(long id, String title, int quantity, double price, String imageUrl) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}