package com.wzp.lineloss.service.impl;

import com.wzp.lineloss.entity.User;
import com.wzp.lineloss.mapper.UserMapper;
import com.wzp.lineloss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wzp
 * @date 2019-11-15 14:34
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User findUserByT(User user) {
        return userMapper.selectOne(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
