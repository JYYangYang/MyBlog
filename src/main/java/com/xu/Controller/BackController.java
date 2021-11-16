package com.xu.Controller;

import com.xu.Service.ArticleService;
import com.xu.pojo.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/back")
public class BackController {
    @Autowired
    ArticleService service;
    @RequestMapping("/editor")
    public String ToEditer(){
        return "article/edit";
    }


    @RequestMapping("/QAll")
    public String QueryAll(Model model){
        List<article> articles = service.QueryAll();
        model.addAttribute("Allarticle",articles);
        return "Backstage/custom";
    }

    @RequestMapping("/Insert")
    public String AInsert(article a){
        service.AInsert(a);
        return "redirect:/article/QAll";
    }


    @RequestMapping("/toback")
    public String ToBackStage(){
        return "Backstage/dashboard";
    }




    @RequestMapping("/del/{id}")
    public String  deleteById(@PathVariable("id") int id){
        service.deleteById(id);
       return "redirect:/back/QAll";
    }


    @RequestMapping("/getid/{id}")
    public String GetId(@PathVariable("id") int id,Model model){
        article article = service.QueryById(id);
        model.addAttribute("update",article);
        return "Backstage/update";
    }


    @RequestMapping("/update")
    public String updateById(article a){
        service.update(a);
        return "redirect:/article/QAll";
    }



}

