package day8.chapter6;

public class Smartphone extends Telephone{
  private String game;

  public Smartphone(String owner, String when, String game){
    super(owner, when);
    this.game = game;
  }
  public Smartphone(String owner, String game) {
    super(owner,"");
    this.game = game;
  }
  void playGame(){
    System.out.println(owner + "가 " + game + " 게임중입니다.");
  }

}
