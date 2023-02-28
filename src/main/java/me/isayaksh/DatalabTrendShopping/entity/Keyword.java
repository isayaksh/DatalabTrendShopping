package me.isayaksh.DatalabTrendShopping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Keyword {
    private String name;
    private List<String> param;
}
