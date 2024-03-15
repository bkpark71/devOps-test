package day9.chapter7;

public class AnonymousDemo2 {
  Bird e = new Bird() {
    @Override
    public void move() {
      System.out.println("독수리가 난다.");
    }
    void sound(){
      System.out.println("휘익");
    }
  };
  //Eagle e = new Eagle();

  public static void main(String[] args) {
    AnonymousDemo2 a = new AnonymousDemo2();
    a.e.move();
    //a.e.sound();
  }
}
