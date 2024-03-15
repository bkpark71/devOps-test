package day9.chapter7;

public class AbstractTest {
  public static void main(String[] args) {
    Concrete c = new Concrete(100,50);
    c.show();
  }
}

abstract class Abstract {
  int i;
  abstract void show();

  public Abstract(int i) {
    this.i = i;
  }
}

class Concrete extends Abstract{
  int i;
  @Override
  void show() {
    System.out.println("구현메서드 입니다.");
  }

  public Concrete(int i, int i1) {
    super(i);
    this.i = i1;
  }
}