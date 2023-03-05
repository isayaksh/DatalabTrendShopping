package me.isayaksh.DatalabTrendShopping.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Null 값인 필드 제외
@AllArgsConstructor @NoArgsConstructor
public class Data {
    private String period;
    private String group;
    private Long ratio;
}
