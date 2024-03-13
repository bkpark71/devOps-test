package day7.chapter5;

import java.util.Arrays;

public class RandomGame {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"};
    System.out.println(name);
    System.out.println(Arrays.toString(name));
    double random ;
    for (int i = 0; i < 10 ; i++) {
      // 가위,바위,보 중의 하나의 값이 랜덤으로 나오도록
      // Math.random 이용하기
      random = Math.random() * 3;
      //System.out.println((int)random);
      System.out.println(name[(int)random]);
    }
  }
}
