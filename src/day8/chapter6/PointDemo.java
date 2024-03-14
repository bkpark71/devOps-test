package day8.chapter6;

public class PointDemo {
  public static void main(String[] args) {
    Point p = new Point(10,5);
    MovablePoint mp = new MovablePoint(5,5,100,200);

    // point의 x, y 좌표의 값 출력
    System.out.println(p);
    System.out.println(mp);// movable point의 x, y 좌표의 값과 이동속도를 출력
  }
}
