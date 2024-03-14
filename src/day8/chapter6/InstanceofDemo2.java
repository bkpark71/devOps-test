package day8.chapter6;

public class InstanceofDemo2 {
  public static void main(String[] args) {
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(5);
    Circle c3 = new Circle(3);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));

  }
}
