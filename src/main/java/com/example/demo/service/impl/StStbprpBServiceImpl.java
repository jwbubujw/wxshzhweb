package com.example.demo.service.impl;

import com.example.demo.dao.StStbprpBDao;
import com.example.demo.entity.StStbprpBEntity;
import com.example.demo.service.StStbprpBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StStbprpBServiceImpl implements StStbprpBService {
    @Autowired
    private StStbprpBDao stStbprpBDao;

    @Override
    public List<StStbprpBEntity> queryStStbprpB() {
        return stStbprpBDao.queryStStbprpB();
    }

    @Override
    public StStbprpBEntity queryStStbprpBByStcd(int stcd) {
        return null;
    }

    @Override
    public int insertStStbprpB(StStbprpBEntity stStbprp) {
        return 0;
    }

    @Override
    public int updateStStbprpB(StStbprpBEntity stStbprp) {
        return 0;
    }

    @Override
    public int deleteStStbprpB(String stcd) {
        return 0;
    }
}
