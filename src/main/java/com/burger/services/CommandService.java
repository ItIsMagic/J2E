package com.burger.services;

import com.burger.models.Command;
import com.burger.repositories.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandService {

    @Autowired
    private CommandRepository commandRepository;

    public List<Command> getAll() { return commandRepository.findAll(); }

    public Command getOne(int id) { return commandRepository.findById(id).orElse(null); }

    public Command save(Command command) { return commandRepository.save(command); }

    public void delete(Command command) { commandRepository.delete(command); }

    public void deleteById(int id) { commandRepository.deleteById(id); }
}
