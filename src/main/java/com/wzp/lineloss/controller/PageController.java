package com.wzp.lineloss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wzp
 * @date 2019-11-20 14:41
 */
@Controller
public class PageController {
    @RequestMapping("/gdgl")
    public String xsfx(){
        return "gdgl";
    }
    @RequestMapping("/xtgj")
    public String xtgj(){
        return "xtgj";
    }
    @RequestMapping("/zlbg")
    public String zlbg(){
        return "zlbg";
    }
    @RequestMapping("xtgl")
    public String xtgl(){
        return "xtgl";
    }
    @RequestMapping("/tjfx")
    public String tjfx(){
        return "tjfx";
    }

}
