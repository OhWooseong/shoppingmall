package com.shopping.shoppingmall.service;

import com.shopping.shoppingmall.domain.user.User;
import com.shopping.shoppingmall.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class AuthService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public User signup(User user){
        String rawPassword = user.getPassword();
        String encPassword = bCryptPasswordEncoder.encode(rawPassword);
        user.setPassword(encPassword);
        user.setRole("ROLE_USER"); // 기본 user 권한
        System.out.println(encPassword);

        User userEntity = userRepository.save(user);
        return userEntity;
    }

    @Transactional // Write(Insert, Update, Delete)
    public User userUpdate(User user) {
        User userEntity = userRepository.save(user);
        return userEntity;
    }

}
