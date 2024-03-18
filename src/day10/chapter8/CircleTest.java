package day10.chapter8;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if(c1.equals(c2)){
      System.out.println("c1과 c2는 같다.");
    }
  }
}

class Circle{
  int radius;
  public Circle(int radius){
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
//    if(obj instanceof Circle circle)
//      return this.radius == circle.radius;
//    else
//      return false;
      return (obj instanceof Circle circle) ? this.radius == circle.radius : false;
  }
}