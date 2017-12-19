package com.sy.dubbossm.Service.ServiceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.sy.dubbossm.POJO.User;
import com.sy.dubbossm.Service.DAO.UserDAO;
import com.sy.dubbossm.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sy on 2017/12/19.
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserDAO userDAO;

    public User loginUser(User user) {
        return userDAO.loginUser(user);
    }

    public Boolean insertUser(User user) {
        return null;
    }

    public Boolean updateUser(User user) {
        return null;
    }

    public Boolean deleteUser(User user) {
        return null;
    }

    public User queryOneUser(User user) {
        return null;
    }

    public List<User> queryAllUser() {
        return null;
    }
}
