package com.example.demo.dao;

import com.example.demo.entity.StStbprpBEntity;

import java.util.List;

public interface StStbprpBDao {
    List<StStbprpBEntity> queryStStbprpB();

    StStbprpBEntity queryStStbprpBByStcd(int stcd);

    int insertStStbprpB(StStbprpBEntity stStbprp);

    int updateStStbprpB(StStbprpBEntity stStbprp);

    int deleteStStbprpB(String stcd);
}
