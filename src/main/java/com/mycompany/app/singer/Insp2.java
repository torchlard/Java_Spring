package com.mycompany.app.singer;

import org.springframework.stereotype.Component;

@Component
public class Insp2 {
  private String secret = "I am boy.";

  public void setSecret(String s){
    this.secret = s;
  }
  public String getSecret(){
    return this.secret;
  }
}





