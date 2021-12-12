package com.main.DataRest;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataRestApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

public class SpringDataRelationshipsTest {

    @Autowired
    private TestRestTemplate template;

    private static String STORE_ENDPOINT = "http://localhost:8080/stores/";
    private static String ADDRESS_ENDPOINT = "http://localhost:8080/addresses/";
    private static String PRODUCT_ENDPOINT = "http://localhost:8080/products/";

    private static String STORE_NAME = "My MAIN STORE";
    private static String PRODUCT_NAME = "COOKIES";
}