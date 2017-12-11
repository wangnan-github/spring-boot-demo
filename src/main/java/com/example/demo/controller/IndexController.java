package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.annotation.ContentSecurity;
import com.example.demo.annotation.ContentSecurityAttribute;
import com.example.demo.bean.StudentEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 表单提交控制器
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/9/16
 * Time：22:26
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class IndexController
{
    /**
     *
     * @param student
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/submit")
    @ContentSecurity
    public String security
            (@ContentSecurityAttribute("student") @Valid StudentEntity student)
            throws Exception
    {
        System.out.println(JSON.toJSON(student));

        return "SUCCESS";
    }
}
