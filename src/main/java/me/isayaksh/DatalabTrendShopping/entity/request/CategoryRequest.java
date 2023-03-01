package me.isayaksh.DatalabTrendShopping.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CategoryRequest extends Request{
    private String category;
}
