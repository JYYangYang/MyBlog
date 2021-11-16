package com.xu.Controller;

import com.xu.Service.ArticleService;
import com.xu.pojo.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/jmp")
public class PageJmpController {

    @Autowired
    ArticleService service;
    @RequestMapping("/login")
    public String toLogin(){
        return "Login/Login";
    }


    @RequestMapping("/main")
    public String JmpToMain(Model model){
        List<article> articles = service.QueryAll();
        model.addAttribute("Allarticle",articles);
        return "main";
    }



   @RequestMapping("/error")
    public String loginworry(Model model){

            model.addAttribute("msg","用户名或密码不正确");

        return "Login/Login";
    }


}
