package day8.chapter6;

public class OverTypeDemo {
  public static void main(String[] args) {
    Vehicle v = new Car();
    System.out.println(v.name);// 탈것 ? 자동차
    v.whoami(); // 탈것 ? 자동차
    if (v instanceof Car car)
      car.whoareyou();
    v.move(); // 이동하다. ? 달리다.

    Car c = new Car();
    System.out.println(c.name);
    c.whoami();
    c.move();

    Vehicle v2 = new Vehicle();
    System.out.println(v2.name);
    v2.whoami();
    v2.move();
  }
}
