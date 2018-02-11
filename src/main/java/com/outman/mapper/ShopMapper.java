package com.outman.mapper;

import com.outman.po.Shop;

import java.util.List;

public interface ShopMapper {
    /**
     * 查询商户列表
     * @param shop
     * @return
     */
    List<Shop> getShopByParams(Shop shop);


}
