package day5.chapter5;

public class ArrayDemo {
  public static void main(String[] args) {
    int score1 = 100;
    int score2 = 90;
    int score3 = 80;
    int score4 = 70;
    int score5 = 80;
    String grade = "";
    if(score1 >= 90) grade = "A";
    if(score2 >= 90) grade = "A";

//    int[] score = new int[5];
//    for (int i = 0; i < 5; i++) {
//      score[i]=100;
//      System.out.println(score[i]);
//    }

    int[] scores = { 100, 90, 80, 70, 60 };
    int[] scores1 = new int[]{ 100, 90, 80, 70, 60 };

    System.out.println("3번째 학생의 점수는 " + scores[2] + "입니다.");

    scores[2] = 85;

    System.out.println("3번째 학생의 점수는 " + scores[2] + "입니다.");
    System.out.println(scores.length);
    //scores.length = 10;
  }
}
