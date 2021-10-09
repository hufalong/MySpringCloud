package com.example.cloudribbon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Hu FaLong
 * @date: Created in 15:27 2021/10/9
 * @description:
 * @modified By:
 * @version: $
 */
@FeignClient("EUREKA-CLIENT-01")
public interface Client01Service {
    @RequestMapping(value = "/cloud/client01")
    String client01(@RequestParam("s") String s);
}
