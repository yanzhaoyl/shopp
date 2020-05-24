package com.yanzhaoyl.shopp.taobao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/** 视图 */
@Controller
public class ViewController {
	@RequestMapping("/")
    public String index(Model model) {
        
        List<Object> commodityList = new ArrayList<>();

        commodityList.add("123");

        model.addAttribute("commodityList", commodityList);
        return "index";
    } 
}
