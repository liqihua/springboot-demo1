package com.liqihua.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController=@Controller + @ResponseBody，所以下面返回String的控制器函数上面不加@ResponseBody都可以
@RestController
@RequestMapping("/loginController")
public class LoginController {

    @RequestMapping("/login1")
    public String login1(){
        return "-- login1 --";
    }

    @RequestMapping("/login2")
    public ResponseEntity login2(){
        return new ResponseEntity<String>("login2", HttpStatus.OK);
    }






}
