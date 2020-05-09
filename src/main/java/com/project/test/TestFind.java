package com.project.test;

import com.project.model.Product;
import com.project.repository.IProductRepository;
import com.project.repository.impl.ProductRepositoryImpl;

public class TestFind {

    public static void main(String[] args) {

        IProductRepository repository = new ProductRepositoryImpl();
        Product product = repository.findProduct(100);

        if(product != null) {
            System.out.println(product);
        }

    }
}
