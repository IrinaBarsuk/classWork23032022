package com.example.restmysql.contpoller;

import com.example.restmysql.model.Product;
import com.example.restmysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> listAll() {
        return service.listAll();
    }




}
