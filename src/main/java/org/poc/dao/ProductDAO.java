package org.poc.dao;

import org.poc.entities.Product;

import java.util.List;

// Interface to manage CRUD operations for Product entities
public interface ProductDAO {

    // Create a new Product record in the database
    void createProduct(Product product);

    // Retrieve a Product record from the database by its ID
    Product readProduct(Long productId);

    // Update an existing Product record in the database
    void updateProduct(Product product);

    // Delete a Product record from the database by its ID
    void deleteProduct(Long productId);

    // Retrieve a list of all Product records from the database
    List<Product> getProductList();

}