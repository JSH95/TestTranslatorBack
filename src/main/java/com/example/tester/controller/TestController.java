package com.example.testtr.controller;

import com.example.testtr.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor

public class TestController {


    private final TestService testService;

    @GetMapping("/translator/test")

    public String Hello(String msg, String lang){

        return testService.testM(msg, lang);


    }

}