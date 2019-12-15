package com.example.demo.service.impl;

import com.example.demo.dao.GeoDao;
import com.example.demo.entity.GeoEntity;
import com.example.demo.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoImpl implements GeoService {
    @Autowired
    private GeoDao geoDao;

    @Override
    public List<GeoEntity> queryGeo() {
        return geoDao.queryAllGeo();
    }
}
