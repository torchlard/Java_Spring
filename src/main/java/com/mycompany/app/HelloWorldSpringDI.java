package com.mycompany.app;

import com.mycompany.app.decoupled.MessageRenderer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
    // MessageRenderer render = ctx.getBean("renderer", MessageRenderer.class);
    // render.render();

    System.out.println("123");
  }
}


