package com.answercloud.demo.manager;

import com.answercloud.demo.entity.User;
import com.answercloud.demo.mapper.UserMapper;
import com.answercloud.demo.vo.FrontUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

    @Autowired
    private UserMapper userMapper;


    public FrontUser getUserById(Integer id)
    {
        FrontUser frontUser=null;
        if(id==null) return frontUser;
        User user = userMapper.getById(id);
        if(user!=null){
            frontUser=new FrontUser();
            BeanUtils.copyProperties(user,frontUser);
        }
        return frontUser;
    }

}
