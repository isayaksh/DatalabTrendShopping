package me.isayaksh.DatalabTrendShopping.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.isayaksh.DatalabTrendShopping.entity.request.*;
import me.isayaksh.DatalabTrendShopping.entity.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static me.isayaksh.DatalabTrendShopping.entity.request.Device.pc;
import static me.isayaksh.DatalabTrendShopping.entity.request.Gender.f;
import static me.isayaksh.DatalabTrendShopping.entity.request.TimeUnit.month;

@SpringBootTest
class ApiDataLabTrendServiceTest {

    public String apiUrl = "https://openapi.naver.com/v1/datalab/shopping";

    @Autowired
    TrendService service;
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void categoriesTest() throws Exception {

        apiUrl += "/categories";

        String startDate = "2017-08-01";
        String endDate = "2017-09-30";
        TimeUnit timeUnit = month;
        List<Category> category = Arrays.asList(new Category("패션의류", Arrays.asList("50000000")), new Category("화장품/미용", Arrays.asList("50000002")));
        Device device = pc;
        Gender gender = f;
        List<String> ages = Arrays.asList("20", "30");


        CategoriesRequest obj = CategoriesRequest.createCategoriesRequest(startDate, endDate, timeUnit, device, gender, ages, category);
        System.out.println("obj = " + obj);

        String json = objectMapper.writeValueAsString(obj);
        System.out.println("json = " + json);

        Response response = service.trendSearch(obj, apiUrl);
        System.out.println("response = " + response);


//        CategoriesRequest categoriesRequest = new CategoriesRequest(category);
    }

}

//{
//        "startDate": "2017-08-01",
//        "endDate": "2017-09-30",
//        "timeUnit": "month",
//        "category": [
//        {"name": "패션의류", "param": [ "50000000"]},
//        {"name": "화장품/미용", "param": [ "50000002"]}
//        ],
//        "device": "pc",
//        "gender": "f",
//        "ages": [ "20",  "30"]
//        }