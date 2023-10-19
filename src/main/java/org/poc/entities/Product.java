package org.poc.entities;

// Class to represent a Product entity
public class Product {

    // Unique identifier for the product
    private Long productId;

    // Name of the product
    private String name;

    // Description of the product
    private String descr;

    // Color of the product
    private String color;

    // Getter for productId
    public Long getProductId() {
        return productId;
    }

    // Setter for productId
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for description
    public String getDescr() {
        return descr;
    }

    // Setter for description
    public void setDescr(String descr) {
        this.descr = descr;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to represent the Product entity as a String
    @Override
    public String toString() {
        return "Product{" + "productId=" + this.productId + ", name='" + this.name + '\'' + ", descr='" + this.descr + '\'' + ", color='" + this.color + '}';
    }
}