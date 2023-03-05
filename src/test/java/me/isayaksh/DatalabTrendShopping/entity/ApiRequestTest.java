package me.isayaksh.DatalabTrendShopping.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

// @SpringBootTest
class ApiRequestTest {

    private final ObjectMapper mapper = new ObjectMapper();


    @Test
    public void request() throws Exception {

    }

    public String resolve(String request) {
        return request.replaceAll("\"categories\":null,|\"category\":null,", "");
    }

}