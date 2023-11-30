package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
/*
* aspect의 autoProxy 사용에 관한 설정을 해주어야 advice가 동작한다
* proxyTargetClass = true 설정은 cglib를 이용한 프록시를 생성하는 방식으로
* 성능면에서 더 우수 하다
* */
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {
}
