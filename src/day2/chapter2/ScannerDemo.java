package day2.chapter2;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자(실수)를 입력하세요 : ");
    //int num = in.nextInt();
    //float num = in.nextFloat();
    String s = in.nextLine();
    // 입력받은 실수형 문자열을 실수형 숫자로 변환한다.
    // 변환한 값은 새로운 변수를 선언해서 그 변수에 저장한다.
    double d = Double.parseDouble(s);
    double result = 1;
    // 변환한 숫자와 result 값을 더해서 그 결과를 다시 result에 저장한다.
    result = result + d;
    System.out.printf("당신이 입력한 내용은 %s 입니다.", s); // 3.14 입력
    System.out.printf("당신이 입력한 숫자에 1을 더하면 %f 입니다.", result); // 3.14 + 1 = 4.14
  }
}
