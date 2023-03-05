package me.isayaksh.DatalabTrendShopping.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Null 값인 필드 제외
@AllArgsConstructor @NoArgsConstructor
public class Response {
    private String startDate;
    private String endDate;
    private String timeUnit;
    private List<Result> results = new ArrayList<>();
}
