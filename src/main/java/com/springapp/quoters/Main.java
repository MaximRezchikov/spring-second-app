package com.springapp.quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        //it's not correct
        context.getBean(TerminatorQuoter.class).sayQuote();

    }
}
