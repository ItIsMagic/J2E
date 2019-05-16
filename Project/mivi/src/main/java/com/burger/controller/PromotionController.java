package com.burger.controller;

import com.burger.model.Promotion;
import com.burger.repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path ="/promotion")
public class PromotionController {

    @Autowired
    private PromotionRepository promotionRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Promotion> listPromotions() {
        return promotionRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody Promotion getPromotion(@PathVariable int id) {
        return promotionRepository.findById(id).get();
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public @ResponseBody boolean createPromotion(@RequestBody Promotion promotion) {
        System.out.println(promotion);
        Promotion save = promotionRepository.save(promotion);
        return promotionRepository.findById(save.getId()) != null;
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public @ResponseBody Promotion updatePromotion(@RequestBody Promotion promotion) {
        System.out.println(promotion);
        return promotionRepository.save(promotion);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody void deletePromotion(@PathVariable int id) {
        promotionRepository.deleteById(id);
    }

    @GetMapping(path="/bonjoir")
    public @ResponseBody String bonjoir() {
        return "bonjoir";
    }
}
