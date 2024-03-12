package day2.chapter3;

import java.util.Scanner;

public class MultiIfDemo {
  public static void main(String[] args) {
    // 1. 점수를 키보드를 통해 입력을 받는다.
    Scanner in = new Scanner(System.in);
    System.out.println("0부터 100사이의 점수를 입력하세요 : ");
    int score = in.nextInt();
    String grade = "";
    // 2. 점수를 학점으로 변환한다. (90~100 : A , 80~89 : B , 0~79 : 전부 C)
    if(score >= 90) {
      System.out.println("점수가 90보다 크고 100보다 작습니다.");
      grade = "A";
    } else if(score >= 80) {
      grade = "B";
    } else {
      grade = "C";
    }
    System.out.printf("입력받은 점수 %d 의 학점은 %s 입니다.", score, grade);
  }
}
