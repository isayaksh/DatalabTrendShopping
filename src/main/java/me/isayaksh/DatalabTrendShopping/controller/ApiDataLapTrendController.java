package me.isayaksh.DatalabTrendShopping.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.isayaksh.DatalabTrendShopping.entity.request.*;
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
    public String trendSearchByCategories(@RequestBody(required = false) CategoriesRequest request) {
        log.info("request : {}", request);
        return trendService.trendSearch(request, apiUrl + "/categories");
    }

    @Operation(summary = "category", description = "NAVER API : category")
    @PostMapping("/category/{type}")
    public String trendSearchByCategory(@PathVariable("type") String type,
                                        @RequestBody CategoryRequest request) {
        return trendService.trendSearch(request, apiUrl + "/category/" + type);
    }

    @Operation(summary = "keywords", description = "NAVER API : keywords")
    @PostMapping("/category/keywords")
    public String trendSearchByKeywords(@RequestBody KeywordsRequest request) {
        return trendService.trendSearch(request, apiUrl + "/category/keywords");
    }

    @Operation(summary = "keyword", description = "NAVER API : keyword")
    @PostMapping("/category/keyword/{type}")
    public String trendSearchByKeyword(@PathVariable("type") String type,
                                        @RequestBody KeywordRequest request) {
        return trendService.trendSearch(request, apiUrl + "/category/keyword/" + type);
    }
}