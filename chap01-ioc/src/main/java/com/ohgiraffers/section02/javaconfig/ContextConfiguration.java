package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02")
public class ContextConfiguration {

    @Bean(name = "member")
    public MemberDTO getMember(){
        return new MemberDTO(1,"user02","pass","홍길동");
    }
}
