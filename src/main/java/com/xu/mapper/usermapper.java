package com.xu.mapper;

import com.xu.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Mapper
@Repository
public interface usermapper {

 user getuserByname(String name);
}
