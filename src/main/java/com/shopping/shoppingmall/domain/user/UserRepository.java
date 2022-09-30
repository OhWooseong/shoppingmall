package com.shopping.shoppingmall.domain.user;


import com.shopping.shoppingmall.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer > {
    User findByUsername(String username);
}
