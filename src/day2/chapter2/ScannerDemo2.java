package day2.chapter2;

import java.util.Scanner;

public class ScannerDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("숫자(정수) 2개를 입력하세요 : ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int result = num1 + num2;
    System.out.printf("num1 = %d and num2 = %d and num1 + num2 = %d", num1, num2, result);
  }
}
