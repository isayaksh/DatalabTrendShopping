package me.isayaksh.DatalabTrendShopping.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.isayaksh.DatalabTrendShopping.entity.response.Response;
import me.isayaksh.DatalabTrendShopping.service.TrendService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/openapi.naver.com/v1/datalab/shopping")
public class ApiDataLapTrendController {

    private final TrendService trendService;
    private String apiUrl = "https://openapi.naver.com/v1/datalab/shopping";

    @Operation(summary = "categories", description = "NAVER API : categories")
    @PostMapping("/categories")
    public Response trendSearchByCategories(@RequestBody(required = false) String requestBody) {
        return trendService.trendSearch(requestBody, apiUrl + "/categories");
    }

    @Operation(summary = "category", description = "NAVER API : category")
    @PostMapping("/category/{type}")
    public Response trendSearchByCategory(@PathVariable("type") String type,
                                        @RequestBody String requestBody) {
        return trendService.trendSearch(requestBody, apiUrl + "/category/" + type);
    }

    @Operation(summary = "keywords", description = "NAVER API : keywords")
    @PostMapping("/category/keywords")
    public Response trendSearchByKeywords(@RequestBody String requestBody) {
        return trendService.trendSearch(requestBody, apiUrl + "/category/keywords");
    }

    @Operation(summary = "keyword", description = "NAVER API : keyword")
    @PostMapping("/category/keyword/{type}")
    public Response trendSearchByKeyword(@PathVariable("type") String type,
                                        @RequestBody String requestBody) {
        return trendService.trendSearch(requestBody, apiUrl + "/category/keyword/" + type);
    }
}