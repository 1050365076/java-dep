package com.xy.work.dep.controller;

import com.xy.work.base.BaseController;
import com.xy.work.dep.service.UserService;
import com.xy.work.dep.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class UserController extends BaseController {
    @Resource
    private UserService userService;

    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> queryAll(){
        Map<String,Object> tmp = new HashMap<>();
        tmp.put("code",0);
        tmp.put("msg","");
        tmp.put("data",userService.queryAll());
        tmp.put("count",userService.queryAll().size());
        return tmp;
    }

    @RequestMapping("index")
    public String index(){
        return "user/user";
    }
}
