package com.sy.dubbossm.Service.DAO;

import com.sy.dubbossm.POJO.User;
import org.springframework.stereotype.Repository;

/**
 * Created by sy on 2017/12/19.
 */
@Repository
public interface UserDAO  extends BaseDAO<User>{

    User loginUser(User user);


}
