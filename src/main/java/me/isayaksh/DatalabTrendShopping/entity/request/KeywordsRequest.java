package me.isayaksh.DatalabTrendShopping.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.isayaksh.DatalabTrendShopping.entity.Keyword;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class KeywordsRequest extends Request{
    private String category;
    private List<Keyword> keyword = new ArrayList<>();
}
