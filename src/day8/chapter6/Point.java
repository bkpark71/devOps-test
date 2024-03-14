package day8.chapter6;

public class Point {
  private int x,y;

  // 접근자
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }

  // 생성자
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // toString
  @Override
  public String toString() {
    return "Point(" +
        "x=" + x +
        ", y=" + y +
        ')';
  }
}
