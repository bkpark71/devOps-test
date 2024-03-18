package day10.chapter8;

public class StringBuilderDemo {
  public static void main(String[] args) {
    String s = "hi";
    System.out.println(s.hashCode());
    s = s + "!";
    System.out.println(s.hashCode());

    StringBuilder sb = new StringBuilder("hi");
    System.out.println(sb.hashCode());
    System.out.println(sb.capacity());
    sb.append("!");
    System.out.println(sb);
    System.out.println(sb.hashCode());
    System.out.println(sb.capacity());
    sb.append("123456789012345678");
    System.out.println(sb.capacity());
    System.out.println(sb.replace(0,2,"hello").delete(0,6));
  }
}
