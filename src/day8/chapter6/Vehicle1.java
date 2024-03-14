package day8.chapter6;

public class Vehicle1 {
  String color;
  int speed;
  void show(){
    System.out.printf("색상 : %s , 속도 : %d\n", color , speed);
  }

  public Vehicle1(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }
}
