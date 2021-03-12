package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: www.centoscn.vip
 * @Date: 2021-03-13 2:46
 */
@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "欢迎来到www.centoscn.vip的Spring-Boot测试页面";
    }
}
