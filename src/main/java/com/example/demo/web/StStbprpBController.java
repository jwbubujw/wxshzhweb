package com.example.demo.web;

import com.example.demo.entity.StStbprpBEntity;
import com.example.demo.service.StStbprpBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/station")
public class StStbprpBController {
    @Autowired
    private StStbprpBService stStbprpBService;

    @RequestMapping(value = "/liststation", method = RequestMethod.GET)
    private Map<String, Object> listStStbprpB() {
        Map<String, Object> mop = new HashMap<>();
        List<StStbprpBEntity> list = stStbprpBService.queryStStbprpB();
        mop.put("result", list);
        return mop;
    }
}
