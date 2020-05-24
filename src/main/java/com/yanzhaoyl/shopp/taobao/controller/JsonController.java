package com.yanzhaoyl.shopp.taobao.controller;

import com.yanzhaoyl.shopp.taobao.service.OfficialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/** JSON */
@RestController
public class JsonController {
    @Autowired
    OfficialService officialService;

    @RequestMapping("/getDivcommodity")
    Object getDivcommodity(){
        
        return officialService.getCommodity();
    }
    
    @RequestMapping("/getCommodityCategory")
    Object getCommodityCategory(){
        return officialService.getCommodityCategory();
    }
    
    
}
