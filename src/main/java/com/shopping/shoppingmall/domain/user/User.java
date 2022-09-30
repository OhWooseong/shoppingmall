package com.shopping.shoppingmall.domain.user;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true) // user 중복 안됨
    private String username;
    private String password;
    private String name;
    private String email;
    private int money;

    //주소
    private String address;

    private String phone_number; // 핸드폰번호
    private String grade; // 등급
    private String role; // 권한

    private LocalDateTime createDate; // 날짜




}
