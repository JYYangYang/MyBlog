package com.xu.Controller;

import com.xu.Service.ArticleService;
import com.xu.pojo.page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/Page")
public class PageController {
    @Autowired
    ArticleService service;
    @RequestMapping("/ToPage")
    public String pagecontroller(Integer currentPage, Integer pageSize,
                                 Model model, HttpServletRequest request) throws SQLException {

        pageSize=5;
        if(request.getParameter("currentPage")==null)
        {
            currentPage=1;
        }
        else
        {
            currentPage=Integer.parseInt(request.getParameter("currentPage"));
        }

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("startIndex",(currentPage-1)*pageSize);
        map.put("pageSize",pageSize);

        page page = service.selectByPage(currentPage,pageSize,map);
        model.addAttribute("pageBean",page);
        return "main";
    }
}
