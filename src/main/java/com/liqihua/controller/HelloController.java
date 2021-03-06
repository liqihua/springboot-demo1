package com.liqihua.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication// = @Configuration + @EnableAutoConfiguration + @ComponentScan
@RequestMapping("/helloController")
public class HelloController {


    @RequestMapping("/hello")
    public ResponseEntity home(){
        return new ResponseEntity<String>("home", HttpStatus.OK);
    }

    /*不加@ResponseBody会报404*/
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "-- test --";
    }
}
