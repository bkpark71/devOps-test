package day11.chapter9;

public class BoxTest {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(Integer.valueOf(100));
    //i.set("hello");
    System.out.println(i.get() + 100);

    Box<String> s = new Box<>();
    s.set("hello");
    //s.set(Integer.valueOf(100));
    System.out.println(s.get());
  }
}
