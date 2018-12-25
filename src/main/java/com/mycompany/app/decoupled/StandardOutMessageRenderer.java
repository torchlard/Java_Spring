package com.mycompany.app.decoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
  private MessageProvider messageProvider;
  
  @Override
  public void render(){
    if(messageProvider == null){
      throw new RuntimeException(
        "you must set property messageProvider of class"
          +StandardOutMessageRenderer.class.getName()
      );
    }
    System.out.println(messageProvider.getMessage());
  }

  @Override
  @Autowired
  public void setMessageProvider(MessageProvider provider){
    this.messageProvider = provider;
  }

  @Override
  public MessageProvider getMessageProvider(){
    return this.messageProvider;
  }

}



