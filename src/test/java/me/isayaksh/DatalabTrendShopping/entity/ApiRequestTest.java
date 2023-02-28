package me.isayaksh.DatalabTrendShopping.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
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
        Request request = Request.builder()
                .startDate("2017-08-01")
                .endDate("2017-09-30")
                .timeUnit(month)
                .category("50000000")
                .device(pc)
                .gender(f)
                .ages(new ArrayList<>(Arrays.asList("20", "30")))
                .build();

        Request request1 = Request.builder()
                .startDate("2017-08-01")
                .endDate("2017-09-30")
                .timeUnit(month)
                .categories(new ArrayList<>(Arrays.asList(new Category("패션의류", "50000000"), new Category("화장품/미용", "50000002"))))
                .device(pc)
                .gender(f)
                .ages(new ArrayList<>(Arrays.asList("20", "30")))
                .build();

        String s1 = mapper.writeValueAsString(request);
        System.out.println("s1 = " + s1);
        System.out.println(resolve(s1));
        String s2 = mapper.writeValueAsString(request1);
        System.out.println("s2 = " + s2);
        System.out.println(resolve(s2));
    }

    public String resolve(String request) {
        return request.replaceAll("\"categories\":null,|\"category\":null,", "");
    }

}