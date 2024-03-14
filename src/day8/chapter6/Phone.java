package day8.chapter6;

public class Phone {
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  void talk(){
    System.out.println(owner + "가 통화중입니다.");
  }

}
