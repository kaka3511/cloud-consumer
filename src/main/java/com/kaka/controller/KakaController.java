package com.kaka.controller;

import com.kaka.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Description: TODO
 * @Author fuwei
 * @Date Created in  2018/12/11 20:17
 */
@RestController
@RequestMapping("/kaka")
public class KakaController {

    @Autowired
    private CloudService cloudService;

    @GetMapping(value = "/get")
    public void get(@RequestParam(value = "one", required = false) String one,
                    @RequestParam(value = "two", required = false) String two){
        System.out.println("get调用返回:" + cloudService.get(one, two));
    }

    @PostMapping(value = "/post")
    public void post(@RequestBody Map map){
        System.out.println("post调用返回:" + cloudService.post(map));
    }
}
