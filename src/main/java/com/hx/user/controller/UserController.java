package com.hx.user.controller;

import com.hx.entity.User;
import com.hx.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService userService;

    @RequestMapping(value="/list", method={RequestMethod.GET,RequestMethod.POST})
    public ModelAndView getUserInfo(HttpServletRequest request){
        String name = request.getParameter("name");
        log.error("eeror");
        System.out.println("111");
        User param = new User();
        param.setId(1);
        User user  =  userService.selectById(param);
        ModelAndView mav=new ModelAndView("user");
            mav.getModel().put("name", user.getName());
        return mav;
    }
}
