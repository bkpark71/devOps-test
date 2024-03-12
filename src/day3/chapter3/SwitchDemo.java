package day3.chapter3;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    // 1. 점수를 키보드를 통해 입력을 받는다.
    Scanner in = new Scanner(System.in);
    System.out.println("100,90,80,70,60의 점수만 입력하세요 : ");
    int score = in.nextInt();
    String grade = "";
    // 2. 점수를 학점으로 변환한다. (90~100 : A , 80~89 : B , 0~79 : 전부 C)
    if(score >= 90) {
      System.out.println("점수가 90보다 크고 100보다 작습니다.");
      grade = "A";
    } else if(score >= 80) {
      grade = "B";
    } else if(score >= 70){
      grade = "C";
    } else {
      grade = "F";
    }
    System.out.printf("입력받은 점수 %d 의 학점은 %s 입니다.\n", score, grade);

    grade = ""; // 90, 80, 70, 60
    switch (score) {
      case 100 :
//        System.out.println("100점입니다.");
//        grade = "A";
      case 90 :
        System.out.println("90점이거나 100점입니다.");
        grade = "A";
        break;
      case 80 :
        System.out.println("80점입니다.");
        grade = "B";
        break;
      case 70 :
        System.out.println("70점입니다.");
        grade = "C";
        break;
      default :
        System.out.println("60점입니다.");
        grade = "F";
    }
    System.out.printf("입력받은 점수 %d 의 학점은 %s 입니다.", score, grade);
  }
}
