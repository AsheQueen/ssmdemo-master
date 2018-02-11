package com.outman.dao.impl;

import com.outman.dao.ShopDao;
import com.outman.mapper.ShopMapper;
import com.outman.po.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * shop dao层
 * @author xuwenlong
 * @create 2018-01-17 下午4:22
 **/

@Repository
public class ShopDaoImpl implements ShopDao{

    @Autowired
    private ShopMapper shopMapper;

    public List<Shop> getAllShops() {
        return null;
    }

    public List<Shop> getShopByParams(Shop shop) {
        List<Shop> shops = new ArrayList<Shop>();
//        System.out.println(shop.toString());
        shops = shopMapper.getShopByParams(shop);
        return shops;
    }

}
