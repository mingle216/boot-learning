package com.mingle.boot;

import com.mingle.web.pojo.SimpleBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mingle
 * @date 2022/3/7 15:20
 * @description Helloworld
 */

@RestController
public class HelloController {
    @Resource
    private SimpleBean simpleBean;
    @GetMapping(value = "/hello")
    public String getHello(){

        return simpleBean.getName();
    }
}
