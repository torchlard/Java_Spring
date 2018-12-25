package com.mycompany.app.singer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("singer")
public class Singer {
  @Autowired
  private Inspiration inspirationBean;

  @Autowired
  private Insp2 insp2Bean;

  public void sing(){
    System.out.println("... "+ inspirationBean.getLyric());
  }

  public void talkSecret(){
    System.out.println("my secret is: " + insp2Bean.getSecret() );
  }
}










