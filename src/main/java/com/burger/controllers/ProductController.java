package com.burger.controllers;

import com.burger.models.Product;
import com.burger.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    @ResponseBody
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Product getOne(@PathVariable("id") int id) {
        return productService.getOne(id);
    }

    @GetMapping("/promotion/{id}")
    @ResponseBody
    public List<Product> getByPromotion(@PathVariable("id") int id) {
        return productService.getByPromotionId(id);
    }

    @PostMapping("/")
    @ResponseBody
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping(value = "/")
    @ResponseBody
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping(path="/{id}")
    @ResponseBody
    public void delete(@PathVariable int id) {
        productService.deleteById(id);
    }
}
