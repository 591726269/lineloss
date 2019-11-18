package com.wzp.lineloss.controller;

import com.wzp.lineloss.entity.User;
import com.wzp.lineloss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author wzp
 * @date 2019-11-08 09:45
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 去到用户注册页面
     * @return
     */
    @RequestMapping("/toRegister")
    public String toRegister() {

        return "/user/register";
    }
    /**
     * 查询是否重名
     * @param name
     * @return
     */
    @RequestMapping("/checkName")
    @ResponseBody
    public int checkName(String name) {
        User user = new User();
        user.setName(name);

        User u = userService.findUserByT(user);
        if(u!=null) {
            return 1;
        }else {
            return 0;
        }
    }
    /**
     * 注册实现
     * @param user
     * @return
     */
    @RequestMapping("/doRegister")
    @ResponseBody
    public int doRegister(User user) {
        int i = userService.save(user);
        if(i>0) {
            return 1;
        }else {
            return 0;
        }
    }
    /**
     * 去到用户登陆页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin() {

        return "/user/login";
    }
    /**
     * 登录实现
     * @param user
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public int login(User user, HttpSession session) {
        User loginUser = userService.findUserByT(user);
        session.setAttribute("loginUser", loginUser);
        if(loginUser!=null) {
            return 1;
        }else {
            return 0;
        }
    }

}
