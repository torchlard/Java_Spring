package com.mycompany.app.singer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Inspiration {
  private String lyric = "I can keep door cracked open, to let light through";

  public Inspiration(@Value("For all my running, I can understand") String lyric){
    this.lyric = lyric;
  }
  // public Inspiration(){}
  
  public void setLyric(String ly){
    this.lyric = ly;
  }

  public String getLyric(){
    return this.lyric;
  }

}





