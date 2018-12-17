package com.imooc.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin/center")
    private String adminCenterPage() {
        return "admin/center";
    }

    @GetMapping("/admin/welcome")
    private String adminWelcomePage() {
        return "admin/welcome";
    }

    @GetMapping("/admin/login")
    private String adminLoginPage() {
        return "admin/login";
    }
}
