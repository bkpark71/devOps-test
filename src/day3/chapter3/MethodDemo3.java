package day3.chapter3;

import java.util.Scanner;

public class MethodDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하세요 :");
    int score = in.nextInt();
    if (checkScore(score)) {
      System.out.println("점수는 " + score);
    } else {
      System.out.println("잘못된 점수입니다.");
    }
  }

  private static boolean checkScore(int score) {

    if(score < 0 || score > 100) {
      //System.out.println("잘못된 점수입니다.");
      return false;
    }
    //System.out.println("점수는 : " + score);
    return true;
  }
}
