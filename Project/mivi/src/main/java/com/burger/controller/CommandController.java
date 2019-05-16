package com.burger.controller;

import com.burger.model.Command;
import com.burger.repositories.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path ="/command")
public class CommandController {

    @Autowired
    private CommandRepository commandRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Command> listCommands() {
        return commandRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public @ResponseBody Command getCommand(@PathVariable int id) {
        return commandRepository.findById(id).get();
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public @ResponseBody boolean createCommand(@RequestBody Command command) {
        System.out.println(command);
        return commandRepository.findById(commandRepository.save(command).getId()) != null;
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public @ResponseBody Command updateCommand(@RequestBody Command command) {
        System.out.println(command);
        return commandRepository.save(command);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody void deleteCommand(@PathVariable int id) {
        commandRepository.deleteById(id);
    }

    @GetMapping(path="/bonjoir")
    public @ResponseBody String bonjoir() {
        return "bonjoir";
    }

    // add in command
    // delete in command
}
