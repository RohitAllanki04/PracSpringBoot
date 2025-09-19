package com.pracspring.singleWebApp.controller;

import com.pracspring.singleWebApp.model.Product;
import com.pracspring.singleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")    // use lowercase for consistency
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")         // lowercase variable name
    public Product getProductById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }
    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") int prodId) {
        productService.deleteProduct(prodId);
    }
}
