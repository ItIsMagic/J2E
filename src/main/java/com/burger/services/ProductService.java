package com.burger.services;

import com.burger.models.ListProduct;
import com.burger.models.Menu;
import com.burger.models.Product;
import com.burger.repositories.ListProductRepository;
import com.burger.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ListProductRepository listProductRepository;

    public List<Product> getAll() { return productRepository.findAll(); }

    public List<Product> getByPromotionId(int id_promotion) { return productRepository.findByPromotionId(id_promotion); }

    public Product getOne(int id) { return productRepository.findById(id).orElse(null); }

    public Product save(Product product) {
        Product p = productRepository.save(product);
        Set<ListProduct> res = new HashSet<>();

        if(product.getMenus() != null && product.getMenus().size() != 0) {
            for (ListProduct listProduct : product.getMenus()) {
                listProduct.getId().setProductId(p.getId());
                listProduct.setProduct(p);

                res.add(listProductRepository.save(listProduct));
            }

            p.setMenus(res);
        }

        return p;
    }

    public void delete(Product product) { productRepository.delete(product); }

    public void deleteById(int id) { productRepository.deleteById(id); }
}
