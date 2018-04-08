package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.dao.DyUsersMapper;
import com.ssm.pojo.DyUsers; 

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private DyUsersMapper dyUsersMapper;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        DyUsers user = this.dyUsersMapper.selectByPrimaryKey(userId);
        model.addAttribute("user", user);
        System.out.println(user.getUsername());
        return "user";
    }
}