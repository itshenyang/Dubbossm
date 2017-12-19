package com.sy.dubbossm.client.Service;

import com.sy.dubbossm.POJO.User;
import com.sy.dubbossm.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sy on 2017/12/19.
 */
@org.springframework.stereotype.Service
public class UserClientService {

    @Autowired
    //@Qualifier("UserServiceClient")
    UserService userService;

    public User loginUser(User user){
        return userService.loginUser(user);
    }
}
