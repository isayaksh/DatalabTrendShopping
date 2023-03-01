package me.isayaksh.DatalabTrendShopping.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.isayaksh.DatalabTrendShopping.entity.Category;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CategoriesRequest extends Request {
    private List<Category> category = new ArrayList<>();
}
