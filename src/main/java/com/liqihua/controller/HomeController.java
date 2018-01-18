package com.liqihua.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/homeController")
public class HomeController {


    @RequestMapping("/home")
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
