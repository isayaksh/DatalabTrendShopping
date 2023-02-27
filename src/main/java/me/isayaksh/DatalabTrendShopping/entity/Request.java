package me.isayaksh.DatalabTrendShopping.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.isayaksh.DatalabTrendShopping.entity.embed.Category;
import me.isayaksh.DatalabTrendShopping.entity.embed.Device;
import me.isayaksh.DatalabTrendShopping.entity.embed.Gender;
import me.isayaksh.DatalabTrendShopping.entity.embed.TimeUnit;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Request {
    private String startDate;
    private String endDate;
    private TimeUnit timeUnit;
    private List<Category> categories;
    private String category;
    private Device device;
    private Gender gender;
    private List<String> ages = new ArrayList<>();
}
