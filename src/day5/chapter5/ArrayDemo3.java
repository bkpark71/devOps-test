package day5.chapter5;

import java.util.Scanner;

public class ArrayDemo3 {
  public static void main(String[] args) {
    // Scanner 객체 생성
    Scanner in = new Scanner(System.in);
    // int 형 점수 5개를 저장할 수 있는 배열 scores 를 선언하라.
    int[] scores = new int[5];
    // 5개의 점수를 입력받아서 각각의 점수를 scores 배열에 저장해라.
    System.out.print("5과목의 점수를 입력하세요 : ");
    System.out.print("5과목의 점수를 입력하세요 : ");

    for (int i = 0; i < scores.length ; i++) {
      scores[i] = in.nextInt();
    }
    // 5 과목의 점수의 합(sum)과 평균(avg)을 구하라.
    int sum = 0;
    double avg;
    for (int score : scores) {
      sum += score;
    }
    avg = sum / (double)scores.length;
    System.out.println("sum = " + sum + "이고 avg은 " + avg + " 입니다.");
    System.out.printf("sum = %d 이고, 평균은 %.2f 입니다. %s \n" , sum , avg, "종료");
    System.out.printf("sum = %d 이고, 평균은 %.1f 입니다. %s" , sum , avg, "종료");
  }
}
