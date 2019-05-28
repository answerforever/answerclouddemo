package com.answercloud.demo.rest;

import com.answercloud.demo.manager.UserManager;
import com.answercloud.demo.mapper.UserMapper;
import com.answercloud.demo.vo.FrontUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/front/info", method = RequestMethod.POST)
    public FrontUser getUserInfo(Integer id) {
        FrontUser frontUser = userManager.getUserById(id);
        return frontUser;
    }

}
