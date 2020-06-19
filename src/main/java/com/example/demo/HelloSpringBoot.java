package com.example.demo;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringBoot {

    @Autowired
    private JdbcTemplate template;

    @Autowired
    private Person person;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/myDemo")
    public String sayHello(){
        printMessage();
        return "myDemo";
    }

    @RequestMapping("/demo")
    public String demo(){
        printMessage();
        return "demo";
    }

    @RequestMapping("/vue")
    public String vue(){
        printMessage();
        return "vue";
    }

    public void printMessage(){
        System.out.println("template:" + template);
        System.out.println("user:" + person.getName());
        System.out.println("user:" + person.getAge());
        System.out.println("userName:" + userMapper.getList().get(0).getsName() + "!");
    }
}
