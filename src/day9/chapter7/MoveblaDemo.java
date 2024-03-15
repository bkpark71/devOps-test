package day9.chapter7;

public class MoveblaDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move(4);
    m.move(7);
    //m.show();
    Car c1 = (Car)m;
    c1.show();

    Car c = new Car();
    c.move(3);
    c.move(3);
    c.move(10);
    c.show();
  }
}
