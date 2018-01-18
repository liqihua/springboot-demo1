package com.liqihua.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@SpringBootApplication = (默认属性)@Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
@RequestMapping("/helloController")
public class HelloController {

    @RequestMapping("/hello")
    public ResponseEntity hello(){
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }

    /*不加@ResponseBody会报404*/
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "-- test --";
    }

}
