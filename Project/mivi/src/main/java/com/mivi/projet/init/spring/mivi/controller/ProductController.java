package com.mivi.projet.init.spring.mivi.controller;

import com.mivi.projet.init.spring.mivi.model.Product;
import com.mivi.projet.init.spring.mivi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path ="/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Product> listProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path="/bonjoir")
    public @ResponseBody String bonjoir() {
        return "bonjoir";
    }
    //@RequestMapping(value = "/", method = RequestMethod.POST)
    //@RequestMapping(value = "/", method = RequestMethod.PUT)
    //@RequestMapping(value = "/", method = RequestMethod.DELETE)
}
