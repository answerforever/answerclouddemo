package com.answercloud.demo.mapper;

import com.answercloud.demo.entity.User;
import org.springframework.data.repository.query.Param;
import tk.mybatis.mapper.common.Mapper;


public interface UserMapper extends Mapper<User> {
    User getById(@Param("id") int id);

}
