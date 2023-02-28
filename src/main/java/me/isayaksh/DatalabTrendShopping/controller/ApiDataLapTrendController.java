package me.isayaksh.DatalabTrendShopping.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.isayaksh.DatalabTrendShopping.entity.CategoriesRequest;
import me.isayaksh.DatalabTrendShopping.entity.Category;
import me.isayaksh.DatalabTrendShopping.entity.Request;
import me.isayaksh.DatalabTrendShopping.entity.embed.Device;
import me.isayaksh.DatalabTrendShopping.entity.embed.Gender;
import me.isayaksh.DatalabTrendShopping.entity.embed.TimeUnit;
import me.isayaksh.DatalabTrendShopping.service.TrendService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

import static me.isayaksh.DatalabTrendShopping.entity.embed.Device.pc;
import static me.isayaksh.DatalabTrendShopping.entity.embed.Gender.f;
import static me.isayaksh.DatalabTrendShopping.entity.embed.TimeUnit.month;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/openapi.naver.com/v1/datalab/shopping")
public class ApiDataLapTrendController {

    private final TrendService trendService;
    private String apiUrl = "https://openapi.naver.com/v1/datalab/shopping";

    @Operation(summary = "categories", description = "NAVER API : categories")
    @PostMapping("/categories")
    public String trendSearchByCategories(@RequestBody(required = false) CategoriesRequest request) {
        log.info("request : {}", request);
        return trendService.trendSearch(request, apiUrl + "/categories");
    }

    @Operation(summary = "category", description = "NAVER API : category")
    @PostMapping("/category/{type}")
    public String trendSearchByCategory(@PathVariable("type") String type,
                                        @RequestBody Request request) {
        return trendService.trendSearch(request, apiUrl + "/category" + "/" + type);
    }

    @Operation(summary = "keywords", description = "NAVER API : keywords")
    @PostMapping("/category/keywords")
    public String trendSearchByKeywords(@RequestBody Request request) {
        return trendService.trendSearch(request, apiUrl + "/category/keywords");
    }

    @Operation(summary = "keyword", description = "NAVER API : keyword")
    @PostMapping("/category/keyword/{type}")
    public String trendSearchByKeyword(@PathVariable("type") String type,
                                        @RequestBody Request request) {
        return trendService.trendSearch(request, apiUrl + "/category/keyword" + "/" + type);
    }


}

/**
 * https://openapi.naver.com/v1/datalab/shopping/categories
 * https://openapi.naver.com/v1/datalab/shopping/category/device
 * https://openapi.naver.com/v1/datalab/shopping/category/gender
 * https://openapi.naver.com/v1/datalab/shopping/category/age
 * https://openapi.naver.com/v1/datalab/shopping/category/keywords
 * https://openapi.naver.com/v1/datalab/shopping/category/keyword/device
 * https://openapi.naver.com/v1/datalab/shopping/category/keyword/gender
 * https://openapi.naver.com/v1/datalab/shopping/category/keyword/age
 **/