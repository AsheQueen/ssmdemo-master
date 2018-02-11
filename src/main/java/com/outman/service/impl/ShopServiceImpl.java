package com.outman.service.impl;

import com.outman.dao.ShopDao;
import com.outman.po.Shop;
import com.outman.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopDao shopDao;

    public List<Shop> getAllShops() {
        return shopDao.getAllShops();
    }

    public List<Shop> getShopByParams(Shop shop) {
        return shopDao.getShopByParams(shop);
    }
}
