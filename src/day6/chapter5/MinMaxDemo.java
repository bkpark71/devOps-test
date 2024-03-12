package day6.chapter5;

import java.util.Arrays;

public class MinMaxDemo {
  public static void main(String[] args) {
    float[] fArr = {2.0f, 10.2f, 3.5f, 4.1f, 1.0f};
    float max = fArr[0];
    float min = fArr[0];
    for (int i = 1; i < fArr.length; i++) {
      if(fArr[i] > max) max = fArr[i];
      if(fArr[i] < min) min = fArr[i];
    }
    System.out.println("최대값 : " + max);
    System.out.println("최소값 : " + min);
    // Arrays 가 제공하는 메소드를 이용하는 방법
    // Arrays.sort()
    // 맨앞의 값이 최소값, 맨뒤의 값이 최대값
    System.out.println(Arrays.toString(fArr));
    Arrays.sort(fArr);
    System.out.println(Arrays.toString(fArr));
    System.out.println("최대값 : " + fArr[fArr.length - 1]);
    System.out.println("최소값 : " + fArr[0]);
  }
}
