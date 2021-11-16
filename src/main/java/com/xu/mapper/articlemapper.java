package com.xu.mapper;

import com.xu.pojo.article;
import com.xu.pojo.page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface articlemapper {
  List<article> QueryAll();


  article QueryById(int id);
  //分页查询操作
  public page selectByPage(int currentPage, int PageSize,
                           HashMap<String,Object> map)throws SQLException;;



  void AInsert(article a);

  //获得总的文章数量
  public int totalItemNumber();

  //当前页的数据
  public List<article> selectByPageItem(Map<String,Object> map);



  void deleteById(int id);

  void Update(article a);

}
