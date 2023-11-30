package com.ohgiraffers.section02.prototype;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

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
