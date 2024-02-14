package com.knative.test.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public Map<String, Object> hello() {
        Map<String, Object> result = new HashMap<>();
        result.put("time", new Date().getTime());
        return result;
    }
}