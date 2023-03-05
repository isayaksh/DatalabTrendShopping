package me.isayaksh.DatalabTrendShopping.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.isayaksh.DatalabTrendShopping.entity.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiDataLabTrendServiceTest {

    @Autowired
    TrendService service;
    ObjectMapper objectMapper = new ObjectMapper();

}