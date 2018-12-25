package com.mycompany.app.singer;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple{
  private String name;
  private int age;

  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:spring/app-simpleInj.xml");
    ctx.refresh();
    
    InjectSimple simp = (InjectSimple) ctx.getBean("injectSimple");
    System.out.println(simp);
    ctx.close();
  }

  public void setAge(int i){
    this.age = i;
  }

  public void setName(String i){
    this.name = i;
  }

  public String toString(){
    return "Name: " + name + " Age: " + age;
  }
}




