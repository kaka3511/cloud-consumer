package com.kaka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "cloud-producer")
public interface CloudService {

    @GetMapping(value = "cloud-producer/kaka/get", consumes = MediaType.APPLICATION_JSON_VALUE)
    String get(@RequestParam(value = "one", required = false) String one,
               @RequestParam(value = "two", required = false) String two);

    @PostMapping(value = "cloud-producer/kaka/post", consumes = MediaType.APPLICATION_JSON_VALUE)
    String post(@RequestBody Map map);
}
