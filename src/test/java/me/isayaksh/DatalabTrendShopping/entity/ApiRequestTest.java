package me.isayaksh.DatalabTrendShopping.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.isayaksh.DatalabTrendShopping.entity.request.Request;
import me.isayaksh.DatalabTrendShopping.service.CategoriesTrendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;

import static me.isayaksh.DatalabTrendShopping.entity.embed.Device.pc;
import static me.isayaksh.DatalabTrendShopping.entity.embed.Gender.f;
import static me.isayaksh.DatalabTrendShopping.entity.embed.TimeUnit.month;

// @SpringBootTest
class ApiRequestTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private CategoriesTrendService service;

    @Test
    public void request() throws Exception {

    }

    public String resolve(String request) {
        return request.replaceAll("\"categories\":null,|\"category\":null,", "");
    }

}