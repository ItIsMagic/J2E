package com.burger.controller;

import com.burger.model.Product;
import com.burger.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path ="/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Product> listProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody Product getProduct(@PathVariable int id) {
        return productRepository.findById(id).get();
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public @ResponseBody boolean createProduct(@RequestBody Product product) {
        System.out.println(product);
        Product save = productRepository.save(product);
        return productRepository.findById(save.getId()) != null;
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public @ResponseBody Product updateProduct(@RequestBody Product product) {
        System.out.println(product);
        return productRepository.save(product);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }

    @GetMapping(path="/bonjoir")
    public @ResponseBody String bonjoir() {
        return "bonjoir";
    }
}
