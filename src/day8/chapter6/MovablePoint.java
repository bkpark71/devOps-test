package day8.chapter6;

public class MovablePoint extends Point{
  private int xSpeed, ySpeed;

  // 접근자
  public int getxSpeed() {
    return xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  // 생성자
  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  // toString
  @Override
  public String toString() {
    return "MovablePoint{ (" +
        getX() + "," + getY() + ") , " +
        "xSpeed=" + xSpeed +
        ", ySpeed=" + ySpeed +
        '}';
  }
}
