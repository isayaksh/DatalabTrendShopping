package me.isayaksh.DatalabTrendShopping.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriesRequest {

    public String startDate;
    public String endDate;
    public TimeUnit timeUnit;
    public Device device;
    public Gender gender;
    public List<String> ages;

    public List<Category> category = new ArrayList<>();

    public static CategoriesRequest createCategoriesRequest(String startDate, String endDate, TimeUnit timeUnit, Device device, Gender gender, List<String> ages, List<Category> category) {
        CategoriesRequest request = new CategoriesRequest();
        request.startDate = startDate;
        request.endDate = endDate;
        request.timeUnit = timeUnit;
        request.device = device;
        request.gender = gender;
        request.ages = ages;
        request.category = category;
        return request;
    }
}
