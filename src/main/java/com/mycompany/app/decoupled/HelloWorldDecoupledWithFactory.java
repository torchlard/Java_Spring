package com.mycompany.app.decoupled;

public class HelloWorldDecoupledWithFactory {
  public static void main(String[] args) {
    MessageRenderer ren = MessageSupportFactory.getInstance().getMessageRenderer();
    MessageProvider pro = MessageSupportFactory.getInstance().getMessageProvider();

    ren.setMessageProvider(pro);
    ren.render();
  }
}












