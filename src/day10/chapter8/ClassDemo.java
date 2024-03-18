package day10.chapter8;

public class ClassDemo {
  public static void main(String[] args) {
    Keyboard k = new Keyboard("로지텍 키보드");

    System.out.println(k.getClass());

    Class c = k.getClass();
    System.out.println(c.getName());
    System.out.println(c.getSimpleName());
    System.out.println(c.getTypeName());
    System.out.println(c.getPackage().getName());
  }
}
