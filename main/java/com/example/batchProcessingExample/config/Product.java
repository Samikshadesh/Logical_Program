package com.example.batchProcessingExample.config;

public class Product {
    private int product_id;
    private String title;
    private String description;
    private String price;
    private String discount;
    private String discountedPrice;

    public Product() {
    }

    public Product(int product_id, String title, String description, String price, String discount) {
        this.product_id = product_id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
