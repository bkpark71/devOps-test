package day8.chapter7;

public class AbstractDemo {
  public static void main(String[] args) {
    원 c = new 원();
    c.draw();
    사각형 q = new 사각형();
    q.draw();

  }
}

abstract class 도형 {
  int 각형 ;
  abstract void draw();
}

class 원 extends 도형 {

  @Override
  void draw() {
    System.out.println("원을 그리다.");
  }
}

class 사각형 extends 도형 {

  @Override
  void draw() {
    System.out.println("사각형을 그리다.");
  }
}