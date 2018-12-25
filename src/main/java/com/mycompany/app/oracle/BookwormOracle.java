package com.mycompany.app.oracle;

public class BookwormOracle implements Oracle {
  private Encyclopedia encyclopedia;

  public void setEncyclopedia(Encyclopedia encyclopedia) {
    this.encyclopedia = encyclopedia;
  }

  @Override
  public String defineMeaningOfLife(){
    return "go to oracle";
  }
}




