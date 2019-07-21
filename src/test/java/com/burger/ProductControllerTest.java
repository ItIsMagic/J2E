package com.burger;

import com.burger.models.Product;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.StandardCharsets;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void should_get_products() throws Exception {
        this.mvc.perform(get("/product/")).andExpect(status().isOk());
    }

    private Product getProduct() {
        Product product = new Product();
        product.setPrice(1);
        product.setCategory(1);
        product.setHighlight(1);
        product.setAvailable(1);

        return product;
    }

    @Test
    public void should_fail_add_product_because_no_name() throws Exception {

//        this.mvc.perform(
//                post("/product/")
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)
//                .param("name", "4")
//                .param("price", "4")
//                .param("highlight", "4")
//                .param("category", "4")
//                .param("available", "4"))
//
//                .andDo(print())
//                .andExpect(status().isOk());
    }

    @Test
    public void should_fail_add_product_because_no_price() throws Exception {
//        this.mvc.perform(
//                post("/product/")
//                .param("name", "name")
//                .param("highlight", "1")
//                .param("category", "4")
//                .param("available", "4")
//        ).andExpect(status().isInternalServerError());
    }
}
