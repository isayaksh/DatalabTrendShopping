package me.isayaksh.DatalabTrendShopping.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Null 값인 필드 제외
@AllArgsConstructor @NoArgsConstructor
public class Result {
    private String title;
    private List<String> category;
    private List<Data> data;
    private List<String> keyword;
}
