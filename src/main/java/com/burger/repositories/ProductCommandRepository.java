package com.burger.repositories;

import com.burger.model.ProductCommand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCommandRepository extends JpaRepository<ProductCommand, Integer> {

}
