package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zym
 * @Date: 2021-02-25 14:46
 */
@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "hello jenkins 2021-02-26 16:28 from qa \n 我提交代码在qa分支，在Gitee进行将qa分支合并到master";
    }
}
