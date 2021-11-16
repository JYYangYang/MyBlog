package com.xu.Service;

import com.xu.mapper.articlemapper;
import com.xu.pojo.article;
import com.xu.pojo.page;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleService {

    @Autowired
    articlemapper mapper;


    public List<article> QueryAll(){
        List<article> articles = mapper.QueryAll();
        return articles;
    }


    public article QueryById(int i){
        article article = mapper.QueryById(i);
        return article;
    }

    public void AInsert(article a){
        mapper.AInsert(a);
    }


    public page selectByPage(int currentPage, int pagaSize,
                                Map<String,Object> map)throws SQLException
    {
        page<article> p=new page<>();
        p.setPageNo(currentPage);
        p.setPageSize(pagaSize);

        p.setTotalItemNumber(totalItemNumber());
        int totalPageNumber=p.getTotalPageNumber();
        p.setTotalPageNumber(totalPageNumber);
        p.setList(selectByPageItem(map));

        return p;
    }


    public int totalItemNumber(){
        return mapper.totalItemNumber();

    }

    public List<article> selectByPageItem(Map<String,Object> map){
        return mapper.selectByPageItem(map);
    }


   public void deleteById(int id){
        mapper.deleteById(id);
   }

   public void update(article a){
        mapper.Update(a);
   }
}
