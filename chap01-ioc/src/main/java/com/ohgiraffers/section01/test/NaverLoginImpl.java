package com.ohgiraffers.section01.test;

import org.springframework.context.annotation.Primary;

@Primary
public class NaverLoginImpl implements SnsLogin{

    @Override
    public void Login() {
        System.out.println("네이버 로그인");
    }
}
