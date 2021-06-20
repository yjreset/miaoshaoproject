package com.miaoshaproject.service.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: YJ
 * @time: 2021/6/21 0:36
 */
@Data
public class ItemModel {
    private Integer id;
    private String title;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private Integer sales;
    private String imgUrl;
}
