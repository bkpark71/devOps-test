package day12.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeTest {
  public static void main(String[] args) {
    ArrayList<Integer> scores = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int score = -1 ;
    do {
      score = getScore(score,in,scores);
    } while (score > 0);

    if (scores.size() > 0) {
      int max = Collections.max(scores);
      for (int i = 0; i < scores.size(); i++) {
        int sc = scores.get(i);
        if (sc >= max - 10 && sc <= max) {
          System.out.printf("%d번 학생의 성적은 %d점이며 등급은 'A'이다.\n", i, sc);
        } else if (sc >= max - 20 && sc < max - 10) {
          System.out.printf("%d번 학생의 성적은 %d점이며 등급은 'B'이다.\n", i, sc);
        } else if (sc < max - 20) {
          System.out.printf("%d번 학생의 성적은 %d점이며 등급은 'C'이다.\n", i, sc);
        }
      }
    }
  }

  private static int getScore(int score, Scanner in, ArrayList<Integer> scores) {
    System.out.print("점수를 입력하세요 : ");
    try {
      score = in.nextInt();
      if (score > 0)
        scores.add(score);
    } catch (InputMismatchException e) {
      System.out.println("정수로 입력해야 합니다.");
      in.next(); // 를 해주지 않으면 무한루프
    }
    return score;
  }
}
