package org.poc.dao.dummy;

import org.poc.dao.ProductDAO;
import org.poc.entities.Product;

import java.util.ArrayList;
import java.util.List;

// Implementation of the ProductDAO interface using an in-memory list
public class ProductDAOImpl implements ProductDAO {

    // In-memory list to act as a dummy database repository
    private final List<Product> productDummyRepository = new ArrayList<Product>();

    // Constructor initializes the dummy repository with a sample Product
    public ProductDAOImpl() {

        Product p = new Product();
        p.setProductId(100L);
        p.setColor("Brown");
        p.setName("Box");
        p.setDescr("Wooden box");

        productDummyRepository.add(p);
    }

    // Add new Product to the dummy repository
    @Override
    public void createProduct(Product product) {
        if (product != null) {
            productDummyRepository.add(product);
        }
    }

    // Find and return Product by ID from the dummy repository
    @Override
    public Product readProduct(Long productId) {

        long productIdToFind = productId;
        Product foundProduct = null;

        for (Product product : productDummyRepository) {
            if (product.getProductId() == productIdToFind) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct != null) {
            return foundProduct;
        } else {
            System.out.println("Product with ID: " + productIdToFind + " not found.");
        }

        return null;
    }

    // Placeholder for update method
    @Override
    public void updateProduct(Product product) {

    }

    // Delete Product by ID from the dummy repository
    @Override
    public void deleteProduct(Long productId) {

        long productIdToDelete = productId;
        productDummyRepository.removeIf(product -> product.getProductId() == productIdToDelete);

    }

    // Return list of all Products from the dummy repository
    @Override
    public List<Product> getProductList() {
        return productDummyRepository;
    }
}