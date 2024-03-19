package day11.chapter9;

import java.util.Scanner;

public class ExceptionThrowsDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("숫자(정수)를 입력해주세요~ : ");
    String number = in.nextLine();
    System.out.println("숫자(정수)를 입력해주세요~ : ");
    String number2 = in.nextLine();

    try {
      square(number);
      divide(number, number2);
    } catch (NumberFormatException | ArithmeticException e) {
      System.out.println("정수가 아니거나 0으로 나눈 오류입니다.");
    }
  }

  private static void square(String s) throws NumberFormatException {
    int i = Integer.parseInt(s);
    System.out.println(i * i);
  }

  private static void divide(String s, String s1)
      throws ArithmeticException , NumberFormatException {
    int i = Integer.parseInt(s);
    int i1 = Integer.parseInt(s1);
    System.out.println(i / i1);
  }

}
