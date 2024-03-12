package day4.exercise;

public class Circle {
  // 정적 멤버 = static 멤버 = 클래스 멤버
  static int numberOfCircles;
  static final double PI = 3.14;
  // 인스턴스 멤버

  int radius;
  String color = "";
  // 정적 메서드
  static void howMany(){
    //System.out.println(radius);
    System.out.println(numberOfCircles);
    //findArea();

  }
  // 인스턴스 메서드
  double findArea(){
    return PI*radius*radius;
  }
  // 생성자
  public Circle(int radius, String color){
    this.radius = radius;
    this.color = color;
    System.out.println(color + "색의 크기가 " + radius + "인 넓이가 " + findArea() + "인 circle이 " + ++numberOfCircles + "개 생성되었습니다.");
  }
}
