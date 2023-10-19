package org.poc.rest.controllers;

import org.poc.dao.ProductDAO;
import org.poc.dao.dummy.ProductDAOImpl;
import org.poc.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// REST Controller for managing Product entities
@RestController
public class ProductRESTController {

    // Initialize the DAO implementation
    private final ProductDAO productDAO = new ProductDAOImpl();

    // Get a list of all products
    @GetMapping("/products")
    List<Product> all() {
        return productDAO.getProductList();
    }

    // Create a new product
    @PostMapping("/products")
    void newProduct(@RequestBody Product product) {
        productDAO.createProduct(product);
    }

    // Get a single product by ID
    @GetMapping("/products/{id}")
    Product one(@PathVariable Long id) {
        return productDAO.readProduct(id);
    }

    // Update a product by ID
    @PutMapping("/products/{id}")
    void replaceProduct(@RequestBody Product newProduct, @PathVariable Long id) {
        productDAO.updateProduct(newProduct);
    }

    // Delete a product by ID
    @DeleteMapping("/products/{id}")
    void deleteProduct(@PathVariable Long id) {
        productDAO.deleteProduct(id);
    }
}