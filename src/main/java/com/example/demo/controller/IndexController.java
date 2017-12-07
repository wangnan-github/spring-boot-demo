/*
 * Copyright 2016 htouhui.com All right reserved. This software is the
 * confidential and proprietary information of htouhui.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with haitouhui.com.
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WangNan, nan.wang@htouhui.com
 * @version 1.0
 * @date 2017年12月07日
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("IndexController index ... ");
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        System.out.println("IndexController home ... ");
        return "home";
    }

}
