package day10.chapter8;

public class KeyboardDemo {
  public static void main(String[] args) {
    Keyboard k1 = new Keyboard("삼성 키보드");
    Keyboard k2 = new Keyboard("삼성 키보드");
    Keyboard k3 = k2;

    System.out.println(k1 == k2);
    System.out.println(k2 == k3);

    System.out.println(k1.equals(k2));

    System.out.println(k1);
    System.out.println(k2);

    Mouse m1 = new Mouse("무소음 마우스");
    Mouse m2 = new Mouse("광마우스");
    Mouse m3 = m1 ;

    System.out.println(m1==m2);
    System.out.println(m1==m3);

    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }
}
