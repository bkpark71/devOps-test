package day9.chapter7;

public class Notebook extends Computer implements Portable{
  @Override
  public void inMyBag() {
    System.out.println("노트북은 내 가방안에 있다.");
  }

  @Override
  public void turnOn() {
    System.out.println("노트북은 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("노트북은 끈다.");
  }
}
