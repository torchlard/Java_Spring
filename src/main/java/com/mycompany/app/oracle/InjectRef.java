package com.mycompany.app.oracle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectRef {
  private Oracle oracle;

  public void setOracle(Oracle o){
    this.oracle = o;
  }

  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("classpath:spring/app-oracle.xml");
    ctx.refresh();

    InjectRef ref = (InjectRef) ctx.getBean("injectRef");
    System.out.println(ref);
    ctx.close();
  }

  public String toString(){
    return oracle.defineMeaningOfLife();
  }

}




