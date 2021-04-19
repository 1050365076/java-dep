package com.xy.work.dep.service.impl;

import com.xy.work.base.BaseQuery;
import com.xy.work.base.BaseService;
import com.xy.work.dep.dao.UserMapper;
import com.xy.work.dep.query.UserQuery;
import com.xy.work.dep.service.UserService;
import com.xy.work.dep.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl extends BaseService<User,Integer> implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> queryAll() {
        return selectByParams(null);
    }
}
