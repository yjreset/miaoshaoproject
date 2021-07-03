package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

public interface ItemService {
    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;
    //展示商品列表
    List<ItemModel> listItem();
    //商品详情
    ItemModel getItemById(Integer id);
    // 减库存
    boolean decreaseStock(Integer itemId, Integer amount) throws BusinessException;
    // 商品销量增加
    void increaseSales(Integer itemId, Integer amount) throws BusinessException;

}
