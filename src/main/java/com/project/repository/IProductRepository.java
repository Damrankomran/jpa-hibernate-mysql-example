package com.project.repository;

import com.project.model.Product;

public interface IProductRepository {

    void saveProduct(Product product);

    void deleteProduct(Product product);

    Product findProduct(int productID);

    Product updateProduct(Product product);
}
