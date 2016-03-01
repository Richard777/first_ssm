package com.richard.hello.controlller;

import com.richard.hello.model.User;
import com.richard.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liuxubin on 16/2/25.
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public boolean login(@RequestParam("username") String username, @RequestParam("password") String pwd, ModelMap user) {
        return userService.userExist(username, pwd);
    }
}
