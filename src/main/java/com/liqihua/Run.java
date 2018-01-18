package com.liqihua;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.*"})//如果不加这个注解，只会扫描本类同级和下级往下的目录里面的controller
public class Run {



    public static void main(String[] args) {
        SpringApplication.run(Run.class,args);
    }
}
