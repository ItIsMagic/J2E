package com.burger.services;

import com.burger.models.Menu;
import com.burger.models.Product;
import com.burger.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAll() { return menuRepository.findAll(); }

    public List<Menu> getByPromotionId(int id_promotion) { return menuRepository.findByPromotionId(id_promotion); }

    public Menu getOne(int id) { return menuRepository.findById(id).orElse(null); }

    public Menu save(Menu menu) { return menuRepository.save(menu); }

    public void delete(Menu menu) { menuRepository.delete(menu); }

    public void deleteById(int id) { menuRepository.deleteById(id); }
}
