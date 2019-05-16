package com.burger.controller;

import com.burger.model.Admin;
import com.burger.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path ="/admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Admin> listAdmins() {
        return adminRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody Admin getAdmin(@PathVariable int id) {
        return adminRepository.findById(id).get();
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public @ResponseBody boolean createAdmin(@RequestBody Admin admin) {
        System.out.println(admin);
        return adminRepository.findById(adminRepository.save(admin).getId()) != null;
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public @ResponseBody Admin updateAdmin(@RequestBody Admin admin) {
        System.out.println(admin);
        return adminRepository.save(admin);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody void deleteAdmin(@PathVariable int id) {
        adminRepository.deleteById(id);
    }

    @GetMapping(path="/bonjoir")
    public @ResponseBody String bonjoir() {
        return "bonjoir";
    }
}
