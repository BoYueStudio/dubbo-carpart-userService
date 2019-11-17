package com.xiupeilian.user.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.io.IOException;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/5 20:29
 * @Version: 1.0
 **/
public class App  {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext contextTest=new ClassPathXmlApplicationContext("spring/spring-dubbo.xml");
        contextTest.start();

        System.out.println("Provider started.");
        //阻塞 防止jvm关机
        System.in.read(); // press any key to exit
    }


}


