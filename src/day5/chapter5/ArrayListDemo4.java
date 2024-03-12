package day5.chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {
  public static void main(String[] args) {
    // scanner 객체 생성
    Scanner in = new Scanner(System.in);
    // (갯수가 정해져 있는 않은) 여러명의 점수를 저장할 (동적)배열을 선언
    ArrayList<Integer> scores = new ArrayList<>();
    int score;
//    do {
//      System.out.println("점수를 입력하세요. 종료하려면 - 값을 입력하세요 : ");
//
//    // + 값이 입력되면 해당 점수를 배열의 원소에 추가 --- 반복
//    // - 값이 입력되면 입력을 종료
//      score = in.nextInt();
//      if(score >= 0) scores.add(score);
//      //else break;
//    } while(score >= 0);
    System.out.println("점수를 입력하세요. 종료하려면 - 값을 입력하세요 : ");
    score = in.nextInt(); // 100 -10
    while(score >=0) {
      scores.add(score);
      System.out.println("점수를 입력하세요. 종료하려면 - 값을 입력하세요 : ");
      score = in.nextInt(); // 100 -10
    }



    // sum, avg 를 구해서 출력
//    int sum = 0;
//    for (Integer i : scores) {
//      sum += i;
//    }

    int sum=0;
    for (int i = 0; i < scores.size(); i++) {
      sum+= scores.get(i);
    }
    double avg = sum / (double)scores.size();
    System.out.println(sum);
    System.out.println(avg);
  }
}
