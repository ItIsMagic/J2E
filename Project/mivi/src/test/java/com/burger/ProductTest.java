package com.burger;

import com.burger.model.Product;
import com.burger.repositories.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//@ActiveProfiles("integration")
@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = DEFINED_PORT, properties = "server.port=3306")
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class ProductTest {

//    @Autowired
//    ProductRepository productRepository;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    TestEntityManager entityManager;
//
//    @Test
//    public void should_create_product()
//    {
//        Product productTest = new Product(18, "ProductTest", 18.5f,
//                true, 1, false);
//
//        productRepository.save(productTest);
//        System.out.println(productTest.getId());
//
//        Product byId = productRepository.findById(productTest.getId()).get();
//        System.out.println(byId.getId());
//
//        Assert.assertTrue(productTest.getId() == byId.getId());
//        Assert.assertTrue(productTest.getCategory() == byId.getCategory());
//        Assert.assertTrue(productTest.getPrice() == byId.getPrice());
//        Assert.assertTrue(productTest.isAvailable() == byId.isAvailable());
//        Assert.assertTrue(productTest.isHighlight() == byId.isHighlight());
//
//        productRepository.deleteById(byId.getId());
//    }
//
//    @Test
//    public void should_delete_product()
//    {
//        Product productTest = new Product();
//        productTest.setName("Bonjoir du Jour");
//
//        entityManager.persistAndFlush(productTest);
//
//        assertThat(productRepository.findById(productTest.getId()).get()).isEqualTo(productTest);
//    }
//
//    @Test
//    public void should_create_product_for_real() throws Exception
//    {
//        Product productTest = new Product();
//        productTest.setName("Bonjoir du Jour");
//        productTest.setId(42);
//
//        mockMvc.perform(post("/product/add")
//                .contentType("application/json")
//                .content(objectMapper.writeValueAsString(productTest)))
//                .andExpect(status().isOk());
//
//        Product productEntity = productRepository.findById(42).get();
//        assertThat(productEntity.getName()).isEqualTo("Bonjoir du Jour");
//    }

}
