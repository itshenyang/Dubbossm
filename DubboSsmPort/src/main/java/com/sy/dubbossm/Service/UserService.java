package com.sy.dubbossm.Service;

import com.sy.dubbossm.POJO.User;

import java.util.List;

/**
 * Created by sy on 2017/12/19.
 */
public interface UserService extends BaseService {

    User loginUser(User user);

    Boolean insertUser(User user);

    Boolean updateUser(User user);

    Boolean deleteUser(User user);

    User queryOneUser(User user);

    List<User> queryAllUser();

}
