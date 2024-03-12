package day2.chapter3;

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    // 10보다 작거나 같은 수가 입력되면 계속 더 다른 숫자를 입력받는다.
    // 10보다 큰 수가 입력되면 더이상 입력받지 않고 프로그램을 종료한다.
    Scanner in = new Scanner(System.in);
//    System.out.println("숫자를 입력하세요 : ");
//    int num = in.nextInt();
//
//    while(num <= 10) {
//      System.out.println("숫자를 입력하세요 : ");
//      num = in.nextInt();
//    }
//    System.out.println("종료");

    int num;
    do {
      System.out.println("숫자를 입력하세요 : ");
      num = in.nextInt();
    } while (num <= 10);
  }
}
