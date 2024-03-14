package day8.chapter6;

public class Car extends Vehicle {
  String name = "자동차";

  void whoami() {
    System.out.println("나는 자동차입니다.");
  }

  void whoareyou(){
    System.out.println("너도 자동차입니다.");
  }

  static void move(){
    System.out.println("달리다.");
  }
}
