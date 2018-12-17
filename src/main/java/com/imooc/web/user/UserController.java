package com.imooc.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user/login")
    private String userLoginPage() {
        return "user/login";
    }

    @GetMapping("/user/center")
    private String userCenterPage() {
        return "user/center";
    }
}
