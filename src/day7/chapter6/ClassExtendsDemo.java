package day7.chapter6;

public class ClassExtendsDemo {
  public static void main(String[] args) {
    Circle circle = new Circle();

    circle.findArea();
    circle.findRadius();

    Ball ball = new Ball("빨간");

    System.out.println(ball.color);
    ball.findColor();
    circle.findArea();
    ball.findArea();
    ball.findVolume();
    ball.findRadius();
  }
}
