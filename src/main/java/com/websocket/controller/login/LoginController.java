package com.websocket.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program:MavenWebsocketLzl
 * @description:controller
 * @author:Mr.Lzl
 * @create:2019-01-19 16:09
 **/
@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(){
        return "login";
    }
}
