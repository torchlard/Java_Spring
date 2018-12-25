package com.mycompany.app.singer;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:spring/app-singer.xml");
    ctx.refresh();

    Singer singerBean = ctx.getBean(Singer.class);
    singerBean.sing();
    singerBean.talkSecret();

    ctx.close();
  }
}









