package day7.chapter6;

public class Ball extends Circle {
  String color;
  Ball(String color){
    this.color = color;
  }
  void findColor(){
    System.out.println(color+" 색 공입니다.");
  }
  void findVolume(){
    System.out.println("부피는 4/3*3.14*반지름*반지름*반지름 입니다.");
  }

  @Override
  public void findArea() {
    System.out.println("넓이는 4*3.14*반지름*반지름입니다.");
    super.findArea();
  }

  @Override
  protected void findRadius() {
    super.findRadius();
  }

}
