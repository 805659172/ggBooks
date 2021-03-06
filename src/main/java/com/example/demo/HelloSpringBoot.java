package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping("/animateSlide")
    public String animateSlide(){
        printMessage();
        return "animateSlide";
    }

    @RequestMapping("/animate")
    public String animate(){
        printMessage();
        return "animate";
    }

    @RequestMapping("/add")
    public String add(){
        User user = new User();
        //user.setID(2);
        user.setsAccountNO("222");
        user.setsPassword("222");
        user.setsName("222");
        user.setnStatusID(1);
        userMapper.add(user);
        User user2 = userMapper.findByID(2);
        System.out.println(user2.toString());
        return "myDemo";
    }

    @RequestMapping("/ggBooks")
    public String ggBooks(){
        return "login";
    }


    @RequestMapping("/login")
    public String login(User user){
        System.out.println(user.toString());
        User findUser = userMapper.findByAccountNO(user.getsAccountNO());
        if(findUser == null){
            return "login";
        }else {
            System.out.println(findUser.toString());
            if (findUser.getsPassword().equals(user.getsPassword())){
                return "main";
            }else {
                return "login";
            }
        }
    }

    public void printMessage(){
        System.out.println("template:" + template);
        System.out.println("user:" + person.getName());
        System.out.println("user:" + person.getAge());
        System.out.println("userName:" + userMapper.findAll().get(0).getsName() + "!");
        System.out.println("userMessage:" + userMapper.findAll().get(0).toString());
    }
}
