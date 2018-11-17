package com.dbms.triplehao.entity;

public class Products {
    //Primary Key
    private Integer productId;

    private String name;

    private double price;

    private Integer inventoryAmount;

    private String category;

    public Integer getProductID() {
        return productId;
    }

    public void setProductID(Integer productID) {
        this.productId = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(Integer inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
