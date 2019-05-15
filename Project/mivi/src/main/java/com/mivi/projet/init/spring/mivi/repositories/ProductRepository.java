package com.mivi.projet.init.spring.mivi.repositories;

import com.mivi.projet.init.spring.mivi.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
