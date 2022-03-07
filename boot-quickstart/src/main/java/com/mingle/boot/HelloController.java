package com.mingle.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author mingle
 * @date 2022/3/7 15:20
 * @description Helloworld
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String getHello(){
        return "hello world,hmm~";
    }
}
