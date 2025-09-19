package com.pracspring.singleWebApp.service;

import com.pracspring.singleWebApp.model.Product;
import com.pracspring.singleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> productList=new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000),new Product(102,"Mi",15000)
//    ,new Product(103,"oppo",13000),new  Product(104,"Tablet",15000)));
//
    public List<Product> getProducts() {
        return repo.findAll();
    }
    public Product getProductById(int prodId)
    {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product product)
    {
        repo.save(product);
    }
   public void updateProduct(Product product)
    {
    repo.save(product);
    }

    public void deleteProduct(int prodId) {
       repo.deleteById(prodId);
    }
}
