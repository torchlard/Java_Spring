package com.mycompany.app.decoupled;

public class HelloWorldDecoupled {
  public static void main(String[] args) {
    MessageRenderer render = new StandardOutMessageRenderer();
    MessageProvider provider = new HelloWorldMessageProvider();
    render.setMessageProvider(provider);
    render.render();
  }
}






