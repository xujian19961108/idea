package com.atguigu.springboot.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class hahaController {
//private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    DataSource dataSource;

    @RequestMapping("/haha")
    public String haha (String username){
        System.out.println("username =["+ username +"]");
        System.out.println("dataSource =["+ dataSource +"]");
        return "hehe啊";
    }
}
