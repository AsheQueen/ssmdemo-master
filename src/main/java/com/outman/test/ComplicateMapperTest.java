package com.outman.test;

import com.outman.mapper.ComplicateMapper;
import com.outman.po.Complicate;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xuwenlong
 * @create 2018-01-22 上午10:37
 **/

public class ComplicateMapperTest extends TestCase {

    @Autowired
    private ComplicateMapper complicateMapper;

    @Test
    public Complicate testSelectByPrimaryKey(Long complicateId)throws Exception{

        Complicate complicate = new Complicate();
        complicate = complicateMapper.selectByPrimaryKey(new Long(443));
        System.out.println(complicate.toString());
        return complicate;
    }
}
