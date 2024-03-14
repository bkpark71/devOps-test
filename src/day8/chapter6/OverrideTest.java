package day8.chapter6;

public class OverrideTest {
  public static void main(String[] args) {
    Car1 c = new Car1("파랑",200,100,5);
    c.show();

    System.out.println();
    Vehicle1 v = c;
    v.show();
  }
}
