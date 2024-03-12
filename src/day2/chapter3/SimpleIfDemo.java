package day2.chapter3;

import java.util.Scanner;

public class SimpleIfDemo {
  public static void main(String[] args) {
    // 1. 숫자를 키보드를 통해 입력을 받는다.
    Scanner in = new Scanner(System.in);
    System.out.println("숫자를 입력하세요 : ");
    int num = in.nextInt();
    // 2. 입력받은 숫자가 짝수인지 홀수인지를 출력한다.
//    if( num%2 == 0 ) {
//      System.out.println("짝수입니다.");
//    }
//
//    if( num%2 == 1 ) {
//      System.out.println("홀수입니다.");
//    }
    if( num%2 == 0 ) {
      System.out.println("짝수입니다.");
    } else {
      System.out.println("홀수입니다.");
    }
  }
}
