package com.burger.repositories;

import com.burger.model.ListProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListProductRepository extends JpaRepository<ListProduct, Integer> {

}
