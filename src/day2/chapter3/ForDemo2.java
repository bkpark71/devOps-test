package day2.chapter3;

public class ForDemo2 {
  public static void main(String[] args) {
    double number;
    for (int i = 0; i < 6; i++) {
      number = Math.random();
      System.out.println(number);
      System.out.println(number * 6 + 1);
      //System.out.println((int)number * 10 + 1);
      System.out.println((int)(number * 6) + 1);
    }
  }
}
