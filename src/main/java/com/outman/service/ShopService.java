package com.outman.service;

import com.outman.po.Shop;

import java.util.Date;
import java.util.List;

public interface ShopService {

    public List<Shop> getAllShops();

    public List<Shop> getShopByParams(Shop shop);

}
