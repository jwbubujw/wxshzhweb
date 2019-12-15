package com.example.demo.web;

import com.example.demo.dao.GeoDao;
import com.example.demo.entity.GeoEntity;
import com.example.demo.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/geo")
public class GeoController {
    @Autowired
    private GeoService geoService;

    @RequestMapping(value = "/listgeo", method = RequestMethod.GET)
    private Map<String, Object> listGeo() {
        Map<String, Object> mop = new HashMap<>();
        List<GeoEntity> list = geoService.queryGeo();
        mop.put("result", list);
        return mop;
    }
}
