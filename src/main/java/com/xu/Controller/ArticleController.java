package com.xu.Controller;

import com.xu.Service.ArticleService;
import com.xu.pojo.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService service;


    @RequestMapping("/look/{id}")
    public String getId(@PathVariable("id") int id,Model model){
        article atc = service.QueryById(id);
        model.addAttribute("article",atc);
        return "article/article";
    }




}
