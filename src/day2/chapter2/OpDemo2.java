package day2.chapter2;

public class OpDemo2 {
  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    int result = a * b;
    System.out.println(result);

    a = 1_000_000;
    b = 2_000_000;
    long l = 2_000_000_000_000L;
    long result2 = (long)a * b;
    System.out.println(result2);
  }
}
