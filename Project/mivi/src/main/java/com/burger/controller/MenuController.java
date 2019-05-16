package com.burger.controller;

import com.burger.model.Menu;
import com.burger.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path ="/menu")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Menu> listMenus() {
        return menuRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody Menu getMenu(@PathVariable int id) {
        return menuRepository.findById(id).get();
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public @ResponseBody boolean createMenu(@RequestBody Menu menu) {
        System.out.println(menu);
        return menuRepository.findById(menuRepository.save(menu).getId()) != null;
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public @ResponseBody Menu updateMenu(@RequestBody Menu menu) {
        System.out.println(menu);
        return menuRepository.save(menu);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody void deleteMenu(@PathVariable int id) {
        menuRepository.deleteById(id);
    }

    @GetMapping(path="/bonjoir")
    public @ResponseBody String bonjoir() {
        return "bonjoir";
    }
}
