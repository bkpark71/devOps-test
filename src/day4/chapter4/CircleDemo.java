package day4.chapter4;

public class CircleDemo {
  public static void main(String[] args) {
    Circle myCircle = new Circle(1);
    //myCircle.radius = 1;
    //myCircle.setRadius(1);
    myCircle.show();

    Circle yourCircle =  new Circle("yellow");
    //yourCircle.radius = -100;
    //yourCircle.setRadius(-100);
    yourCircle.show();

    Circle c3 = new Circle(10, "red");
    c3.show();

    Circle c4 = new Circle();
    c4.show();
  }
}
