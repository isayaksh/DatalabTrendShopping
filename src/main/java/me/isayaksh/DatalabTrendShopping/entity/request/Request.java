package me.isayaksh.DatalabTrendShopping.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.isayaksh.DatalabTrendShopping.entity.embed.Device;
import me.isayaksh.DatalabTrendShopping.entity.embed.Gender;
import me.isayaksh.DatalabTrendShopping.entity.embed.TimeUnit;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Request {
    public String startDate;
    public String endDate;
    public TimeUnit timeUnit;
    public Device device;
    public Gender gender;
    public List<String> ages = new ArrayList<>();
}

//    private List<Category> categories = new ArrayList<>();
//    private String category;
//    private List<Keyword> keywords = new ArrayList<>();
//    private String keyword;
