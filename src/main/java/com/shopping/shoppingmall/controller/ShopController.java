package com.shopping.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    //메인페이지 (비로그인유저)
    @GetMapping("/")
    public String home(){
        return "/none/main";
    }
    //메인페이지 (로그인유저)
    @GetMapping("/main")
    public String main(){
        return "/user/main";
    }
}
