package com.project.test;

import com.project.model.Product;
import com.project.repository.IProductRepository;
import com.project.repository.impl.ProductRepositoryImpl;

public class TestUpdate {

    public static void main(String[] args) {

        IProductRepository repository = new ProductRepositoryImpl();

        Product product = repository.findProduct(101);

        if(product != null) {
            product.setProductName("iPhone XR");

            repository.updateProduct(product);
        }
    }
}
