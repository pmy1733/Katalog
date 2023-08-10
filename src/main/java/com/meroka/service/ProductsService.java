package com.meroka.service;

import java.util.ArrayList;
import java.util.List;

import com.meroka.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meroka.repository.ProductsRepository;
//defining the business logic
@Service
public class ProductsService
{
    @Autowired
    ProductsRepository productsRepository;
    //getting all product record by using the method findaAll() of CrudRepository
    public List<Product> getAllProducts()
    {
        List<Product> products = new ArrayList<>();
        productsRepository.findAll().forEach(products::add);
        return products;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Product getProductsById(long id)
    {
        return productsRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Product products)
    {
        productsRepository.save(products);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(long id)
    {
        productsRepository.deleteById(id);
    }
}
