package com.longdi.service;

import com.longdi.pojo.User;

/**
 * @author: 龍弟
 * @description
 * @date: 2021/9/16 19:40
 */
public interface UserService {

    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return 返回true表示用户层已经存在
     */
    public boolean existsUsername(String username);
}
