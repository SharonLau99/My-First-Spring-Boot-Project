package org.sharon.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sharon
 * @create 2020-08-11-10:06
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Map map){
        map.put("hello", "你好");
        return "hellothymleaf";
    }
}
