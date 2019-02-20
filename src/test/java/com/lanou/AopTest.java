package com.lanou;

import com.lanou.annonation.Boy;
import com.lanou.aop.Girl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Girl girl = (Girl) context.getBean("girl");
        System.out.println(girl);
        girl.shopping();
    }

    @Test
    void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring--annonation.xml");
        Boy boy = (Boy) context.getBean("boy");
        boy.coding();
    }
}
