package com.ohgiraffers.section03.annotationconfig.subsection01;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration("configurationSection03")
//@ComponentScan(basePackages = "com.ohgiraffers")
//@ComponentScan(basePackages = "com.ohgiraffers" ,
//                excludeFilters = {
//
//                    @ComponentScan.Filter(
                            //타입으로 설정
//                            type = FilterType.ASSIGNABLE_TYPE,
//                            classes = {MemberDAO.class}

                            //어노테이션 기반 제외
//                            type = FilterType.ANNOTATION,
//                            classes = {org.springframework.stereotype.Component.class}

//                            type = FilterType.REGEX,
//                            pattern = {"com.ohgiraffers.*"}
//                    )
//                })


@ComponentScan(basePackages="com.ohgiraffers",
        useDefaultFilters=false,
        includeFilters= {
                @ComponentScan.Filter(
                        /* excludeFilters에서 설정하는 방식과 동일하다 */
                        type=FilterType.ASSIGNABLE_TYPE,
                        classes= {MemberDAO.class}
                )
        })



public class ContextConfiguration {

    public ContextConfiguration() {
    }
}
