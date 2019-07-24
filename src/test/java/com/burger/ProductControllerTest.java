package com.burger;

/*@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc*/
public class ProductControllerTest {

    /*@Autowired
    private MockMvc mvc;
/*
    @Test
    public void should_get_products() throws Exception {
        this.mvc.perform(get("/product/")).andExpect(status().isOk());
    }
*/
    /*private Product getProduct() {
        Product product = new Product();
        product.setPrice(1);
        product.setCategory(1);
        product.setHighlight(1);
        product.setAvailable(1);

        return product;
    }

    @Test
    public void should_fail_add_product_because_no_name() throws Exception {

        Product myTestProduct = new Product();
        myTestProduct.setName("Mon produit de test");
        myTestProduct.setPrice(5.42f);
        myTestProduct.setAvailable(1);
        myTestProduct.setCategory(1);
        myTestProduct.setHighlight(0);
        Gson gson = new Gson();
        gson.toJson(myTestProduct);

        this.mvc.perform(
                post("/product/")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(gson.toJson(myTestProduct)))
                .andExpect(status().isOk());
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
    }*/
}
