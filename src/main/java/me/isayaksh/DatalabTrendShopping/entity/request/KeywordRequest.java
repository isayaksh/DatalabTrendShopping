package me.isayaksh.DatalabTrendShopping.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class KeywordRequest extends Request{
    private String category;
    private String keyword;
}
