package com.shopping.shoppingmall.controller;

import com.shopping.shoppingmall.domain.user.User;
import com.shopping.shoppingmall.service.AuthService;
import com.shopping.shoppingmall.webdto.SignupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class AuthController {
    @Autowired
    private final AuthService authService;

    @GetMapping("/signin")
    public String SigninForm() {
        return "signin";
    }

    @GetMapping("/signup")
    public String SignupForm() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(SignupDto signupDto) {

        // User에 signupDto 넣음
        User user = signupDto.toEntity();


        User userEntity = authService.signup(user);

        return "signin"; //
    }
}
