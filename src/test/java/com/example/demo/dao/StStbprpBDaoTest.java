package com.example.demo.dao;

import com.example.demo.entity.StStbprpBEntity;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StStbprpBDaoTest {
    @Autowired
    private StStbprpBDao stStbprpBDao;

    @Test
    public void queryStStbprpB() {
        List<StStbprpBEntity> stStbprpBDaoList=stStbprpBDao.queryStStbprpB();
        Assert.assertEquals(903,stStbprpBDaoList.size());
    }

    @Test
    @Ignore
    public void queryStStbprpBByStcd() {
    }
}
