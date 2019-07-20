package com.burger.services;

import com.burger.models.Command;
import com.burger.models.Currency;
import com.burger.repositories.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class CommandService {

    @Autowired
    private CommandRepository commandRepository;

    @Autowired
    private CurrencyService currencyService;

    public List<Command> getAll() {
        return commandRepository.findAll();
    }

    public Command getOne(int id) {
        Command command = commandRepository.findById(id).orElse(null);

        if(command != null) {
            try {
                Currency currency = currencyService.getCurrency();

                for (Map.Entry<String, BigDecimal> entry : currency.getRates().entrySet()) {
                    currency.getRates().put(entry.getKey(), entry.getValue().multiply(BigDecimal.valueOf(command.getTotal())));
                }

                command.setCurrency(currency);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return command;
    }

    public Command save(Command command) { return commandRepository.save(command); }

    public void delete(Command command) { commandRepository.delete(command); }

    public void deleteById(int id) { commandRepository.deleteById(id); }
}
