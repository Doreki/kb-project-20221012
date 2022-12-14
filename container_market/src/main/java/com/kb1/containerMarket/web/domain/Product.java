package com.kb1.containerMarket.web.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String pdt_name;
    private int category_id;
    private int pdt_price;
    private String pdt_simple_info;
    private String pdt_detail_info;
    private String pdt_option_info;
    private String pdt_management_info;
    private String pdt_shipping_info;
}
