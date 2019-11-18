package com.wzp.lineloss.service;

import com.wzp.lineloss.entity.User;

import java.util.List;

/**
 * @author wzp
 * @date 2019-11-15 14:25
 */
public interface UserService {
    //保存用户
    int save(User user);

    /**
     * 根据用户传入的条件查找
     * @param user
     * @return
     */
    User findUserByT(User user);

    /**
     * 获取用户列表信息
     * @param
     * @return
     */
    List<User> findAll();
}
