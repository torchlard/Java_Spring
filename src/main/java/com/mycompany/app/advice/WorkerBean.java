package com.mycompany.app.advice;

public class WorkerBean {
  public void doSomeWork(int t){
    for(int x=0; x<t; x++){
      work();
    }
  }
  private void work(){
    System.out.print("");
  }
}


