package com.example.cloudeurekaclient01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Hu FaLong
 * @date: Created in 13:55 2021/10/9
 * @description:
 * @modified By:
 * @version: $
 */
@RestController
@RequestMapping("/cloud")
public class MyController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/client01")
    public String helloWorld(String s){
        String a = port+"传入的值为："+s;
        System.out.println(a);
        return a;
    }
}
