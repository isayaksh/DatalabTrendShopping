package me.isayaksh.DatalabTrendShopping.service;

import me.isayaksh.DatalabTrendShopping.entity.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CategoriesTrendService extends TrendService {

    public CategoriesTrendService(@Value("${client-id}") String clientId, @Value("${client-secret}") String clientSecret) {
        super(clientId, clientSecret);
    }

    @Override
    public String trendSearch(Request request) {
//        String apiUrl = "https://openapi.naver.com/v1/datalab/shopping/categories";
        String apiUrl = "https://openapi.naver.com/v1/datalab/shopping";
        apiUrl += "/category/device";

        Map<String, String> requestHeaders = getRequestHeaders();

        String requestBody = convertString(request);

        return post(apiUrl, requestHeaders, requestBody);
    }

}
