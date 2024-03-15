package day9.chapter7;

public interface Delicious extends Edible, Sweatable{
}

interface Edible {
  void eat();
}

interface Sweatable {
  void sweat();
}

class 다중상속 implements Delicious {

  @Override
  public void eat() {
    System.out.println("먹는다.");
  }

  @Override
  public void sweat() {
    System.out.println("달다");
  }
}