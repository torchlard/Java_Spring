package com.mycompany.app.decoupled;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
  @Override
  public String getMessage(){
    return "Hello world 2";
  }
}











