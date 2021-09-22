package com.longdi.service.impl;

import com.longdi.dao.UserDao;
import com.longdi.dao.impl.UserDaoImpl;
import com.longdi.pojo.User;
import com.longdi.service.UserService;

/**
 * @author: 龍弟
 * @description
 * @date: 2021/9/16 19:48
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao =new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
      if(userDao.queryUserByUsername(username)==null){

          return false;
      }
      return true;
    }
}
