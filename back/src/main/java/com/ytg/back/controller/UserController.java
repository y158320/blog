package com.ytg.back.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(String UserName,String PassWord)
    {
       if (UserName.equals("yangtiangang"))
       {
           if (PassWord.equals("Star*2018"))
           {
               return "SUCCESS";
           }
       }
       return "ERROR";
    }

}
