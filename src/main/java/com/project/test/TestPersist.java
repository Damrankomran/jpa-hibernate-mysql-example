package com.project.test;

import com.project.model.Product;
import com.project.repository.IProductRepository;
import com.project.repository.impl.ProductRepositoryImpl;

import java.util.Calendar;
import java.util.Date;

public class TestPersist {

    public static void main(String[] args) {

        IProductRepository repository = new ProductRepositoryImpl();

        Product product = new Product(102,"Samsung Galaxy Note 8",5500,10,createCustomDate(12,6,2019));
        Product product2 = new Product(103,"iPhone X",10500,5,createCustomDate(3,12,2018));

        repository.saveProduct(product);
        repository.saveProduct(product2);
    }

    public static Date createCustomDate(int day, int month, int year){

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);

        return calendar.getTime();
    }
}
