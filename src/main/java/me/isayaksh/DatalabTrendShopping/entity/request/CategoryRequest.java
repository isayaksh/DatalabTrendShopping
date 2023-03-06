package me.isayaksh.DatalabTrendShopping.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {
    public String startDate;
    public String endDate;
    public TimeUnit timeUnit;
    public Device device;
    public Gender gender;
    public List<String> ages;

    public String category;
}
