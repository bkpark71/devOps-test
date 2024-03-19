package day11.chapter9;

import java.util.Random;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    Random r = new Random();
    try {
      for (int i = 0; i < 10; i++) {
        int number = r.nextInt(10);
        int result = 10 / number;
      }
      String s = null;
      System.out.println(s.length());
    } catch (ArithmeticException | NullPointerException e){
      System.out.println(e.getMessage());
    } catch(Exception e){
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try-catch 종료");
    }
    System.out.println("프로그램 종료");
  }
}
