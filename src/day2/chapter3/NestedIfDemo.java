package day2.chapter3;

import java.util.Scanner;

public class NestedIfDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력하세요");
    int score = in.nextInt();
    String grade = "";

    if (score >= 90) {
      if (score >= 96) {
        grade = "A+";
      } else {
        grade = "A0 or A-";
      }
    }


    System.out.printf("입력받은 점수 %d 의 학점은 %s 입니다.", score, grade);
  }
}
