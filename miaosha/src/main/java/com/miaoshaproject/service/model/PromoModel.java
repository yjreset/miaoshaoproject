package com.miaoshaproject.service.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * @description:
 * @author: YJ
 * @time: 2021/6/22 10:46
 */
@Data
public class PromoModel {
    private Integer id;
    //秒杀活动名称
    private String promoName;
    //秒杀活动适用商品
    private DateTime startDate;
    private DateTime endDate;
    //秒杀活动商品价格
    private BigDecimal promoItemPrice;
    private Integer status;
}
