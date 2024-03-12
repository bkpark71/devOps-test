package day6.chapter5;

public class Ball {
  int radius;
  String color;
  void print(){
    System.out.printf("반지름 : %d 이고 색깔이 %s 인 공입니다.\n",radius,color);
  }
  public Ball(int radius, String color){
    this.radius = radius;
    this.color = color;
  }
}
