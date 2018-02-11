package com.outman.dao;

import com.outman.po.Shop;

import java.util.List;

public interface ShopDao {


    List<Shop> getAllShops();

    List<Shop> getShopByParams(Shop shop);

}
