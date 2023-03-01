package me.isayaksh.DatalabTrendShopping.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class CategoriesTrendService extends TrendService {

    public CategoriesTrendService(@Value("${client-id}") String clientId, @Value("${client-secret}") String clientSecret) {
        super(clientId, clientSecret);
    }

    @Override
    public String trendSearch(Object request, String apiUrl) {
        Map<String, String> requestHeaders = getRequestHeaders();
        String requestBody = convertString(request);
        return post(apiUrl, requestHeaders, requestBody);
    }

}
