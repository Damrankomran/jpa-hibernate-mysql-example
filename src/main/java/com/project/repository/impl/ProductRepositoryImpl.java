package com.project.repository.impl;

import com.project.jpaFactory.JpaFactory;
import com.project.jpaFactory.impl.JpaFactoryImpl;
import com.project.model.Product;
import com.project.repository.IProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ProductRepositoryImpl implements IProductRepository {

    private JpaFactory factory = new JpaFactoryImpl();
    private EntityManager entityManager = factory.getEntityManager();
    private EntityTransaction transaction = factory.getTransaction();

    @Override
    public void saveProduct(Product product) {

        transaction.begin();

        entityManager.persist(product);

        transaction.commit();

        System.out.println("Product save successful!");
    }

    @Override
    public void deleteProduct(Product product) {

        transaction.begin();

        entityManager.remove(product);

        transaction.commit();

        System.out.println("Product delete successful!");
    }

    @Override
    public Product findProduct(int productID) {

        Product product = entityManager.find(Product.class,productID);

        if(product != null){
            System.out.println("Product find successful");
            return product;
        }

        System.out.println("Product not found");
        return null;
    }

    @Override
    public Product updateProduct(Product product) {

        transaction.begin();

        Product updatedProduct = entityManager.merge(product);

        transaction.commit();

        System.out.println("Product update successful!");

        return updatedProduct;
    }
}
