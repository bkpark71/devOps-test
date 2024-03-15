package day9.chapter7;

public class AnonymousDemo1 {
  private class Eagle implements Bird{

    void sound(){
      System.out.println("휘익~");
    }

    @Override
    public void move() {
      System.out.println("독수리가 난다.");
    }
  }

  Eagle e = new Eagle();

  public static void main(String[] args) {
    AnonymousDemo1 a = new AnonymousDemo1();
    a.e.move();
    a.e.sound();
  }
}
