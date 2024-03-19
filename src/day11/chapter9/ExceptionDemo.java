package day11.chapter9;

public class ExceptionDemo {
  public static void main(String[] args) {
    ArithmeticException e = new ArithmeticException("aaa");
    System.out.println(e.getMessage());
    e.printStackTrace();

    //int i = 5/0;

    String s = "";
    System.out.println(s.length());

    Object o = new Object();
    Object o1 = new Object();
    System.out.println(o.equals(o1));

    String[] strings = {};
    System.out.println(strings.length);
  }
}
