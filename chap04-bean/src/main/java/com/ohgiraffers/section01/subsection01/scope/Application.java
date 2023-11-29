package com.ohgiraffers.section01.subsection01.scope;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    /*
    * bean scope란 스프링 빈이 생성될 때 생성되는 인스턴스의 범위를 의미한다
    * 스프링에서는 다양한 bean scope를 제공한다.
    * 1. singleton 하나의 인스턴스만 생성하고, 모든 빈이 해당 인스턴스를 공유하며 사용한다.
    * 2. prototype 매번 새로운 인스턴스를 생성한다
    * 3. request    http 요청을 처리할 때마다 새로운 인스턴스를 생성하고, 요청 처리가 끝나면 인스턴스를 폐기한다. 웹 애플리케이션 컨텍스트에만 해당된다
    * 4. session  http 세션 당 하나의 인스턴스를 생성하고, 세션이 종료되면 인스턴스를 폐기한다. 웹 애플리케이션 컨텍스트에만 해당된다
    * 5. globalSession  전역 세션당 하나의 인스턴스르 생성하고, 전역 세션이 종료되면 인스턴스를 폐기한다. 포털 애플리케이션 컨텍스트에만 해당된다*/


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean :
                beanNames) {
            System.out.println("BeanName : "+bean);
        }

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart = context.getBean("cart",ShoppingCart.class);
        cart.addItem(carpBread);
        cart.addItem(milk);
        System.out.println("cart의 담긴 내용 : "+ cart.getItems());

        ShoppingCart cart2 = context.getBean("cart",ShoppingCart.class);
        cart2.addItem(water);
        System.out.println("cart2의 담긴 내용 : "+cart2.getItems());

        System.out.println("cart의 hashCode : "+cart.hashCode());
        System.out.println("cart2의 hashCode : "+cart2.hashCode());

    }
}
