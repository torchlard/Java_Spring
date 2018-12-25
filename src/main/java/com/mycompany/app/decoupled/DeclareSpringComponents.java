package com.mycompany.app.decoupled;

import org.springframework.context.support.GenericXmlApplicationContext;


public class DeclareSpringComponents {
  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    
    ctx.load("classpth:spring/app-context-xml.xml");
    ctx.refresh();
    MessageRenderer msgRender = ctx.getBean("render", MessageRenderer.class);
    msgRender.render();
    ctx.close();

  }
}




















