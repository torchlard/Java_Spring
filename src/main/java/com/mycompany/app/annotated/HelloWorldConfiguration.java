package com.mycompany.app.annotated;

import com.mycompany.app.decoupled.HelloWorldMessageProvider;
import com.mycompany.app.decoupled.MessageProvider;
import com.mycompany.app.decoupled.MessageRenderer;
import com.mycompany.app.decoupled.StandardOutMessageRenderer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
  @Bean
  public MessageProvider provider(){
    return new HelloWorldMessageProvider();
  }

  @Bean
  public MessageRenderer renderer(){
    MessageRenderer renderer = new StandardOutMessageRenderer();
    renderer.setMessageProvider(provider());
    return renderer;
  }
}









