package day9.chapter7;

public interface Movable {
  void move(int d);
}

class Car implements Movable {
  private int position ;

  @Override
  public void move(int d) {
    position += d;
  }

  public void show() {
    System.out.println(position + "m 이동했습니다.");
  }
}