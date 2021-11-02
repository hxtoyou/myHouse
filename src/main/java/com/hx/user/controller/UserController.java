package com.hx.user.controller;

import com.hx.entity.User;
import com.hx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value="/list", method={RequestMethod.GET,RequestMethod.POST})
    public ModelAndView getUserInfo(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println("111");
        User user  =  userService.getUser(new User());
        return new ModelAndView("user");
    }
}
