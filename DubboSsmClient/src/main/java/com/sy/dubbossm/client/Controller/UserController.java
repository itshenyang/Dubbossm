package com.sy.dubbossm.client.Controller;

import com.sy.dubbossm.POJO.User;
import com.sy.dubbossm.client.Service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sy on 2017/12/19.
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {

    @Autowired
    UserClientService userClientService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Object addDevice(@RequestBody User user) {
        User LoginUser = userClientService.loginUser(user);

        return LoginUser;
    }
}
