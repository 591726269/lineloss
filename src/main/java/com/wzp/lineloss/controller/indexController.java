package com.wzp.lineloss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wzp
 * @date 2019-11-04 11:38
 */
@Controller
public class indexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
