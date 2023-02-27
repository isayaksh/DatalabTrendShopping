package me.isayaksh.DatalabTrendShopping.controller;

import lombok.RequiredArgsConstructor;
import me.isayaksh.DatalabTrendShopping.entity.Request;
import me.isayaksh.DatalabTrendShopping.entity.embed.Category;
import me.isayaksh.DatalabTrendShopping.service.CategoriesTrendService;
import me.isayaksh.DatalabTrendShopping.service.TrendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

import static me.isayaksh.DatalabTrendShopping.entity.embed.Device.pc;
import static me.isayaksh.DatalabTrendShopping.entity.embed.Gender.f;
import static me.isayaksh.DatalabTrendShopping.entity.embed.TimeUnit.month;

@RestController
@RequiredArgsConstructor
@RequestMapping("/openapi.naver.com/v1/datalab/shopping")
public class ApiDataLapTrendController {

    private final TrendService trendService;

    @GetMapping("/categories")
    public String trendSearchByCategories(@RequestBody Request request) {



        return "...";
        // return trendService.trendSearch(request);

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