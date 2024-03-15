package day9.chapter7;

public class LocalClassDemo {
  public static void main(String[] args) {
    class Eagle implements Bird{
      @Override
      public void move() {
        System.out.println("독수리가 난다.");
      }
    }

    Bird e = new Eagle();
    e.move();

    new Bird() {
      @Override
      public void move() {
        System.out.println("독수리가 난다.");
      }
    }.move();
  }
}
