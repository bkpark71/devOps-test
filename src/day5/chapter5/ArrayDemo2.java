package day5.chapter5;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(arr);

    System.out.println("foreach");
    for (int number : arr) {
      System.out.println(number);
    }

    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        System.out.print(arr[i]);
      } else {
        System.out.print(arr[i] + ",");
      }
    }
    System.out.println("]");

    System.out.println(Arrays.toString(arr));

    char[] cArr = {'a', 'b', 'c'};
    for (char c : cArr) {
      System.out.println(c);
    }

    System.out.println(cArr);
    System.out.println(cArr.length);
    System.out.println(cArr[0] + cArr[2] + "");

    String sArr = "abc";
    System.out.println(sArr);


    // 문자열을 원소로 가지는 배열을 생성 = { "A" , "B", "C", "D", "E" }
    // 참조변수 strArr 에 저장한다.
    // strArr 배열의 원소를 전부 출력하라. (1. foreach 2. Arrays의 메서드를 활용 )
    String[] strArr = {"A", "B", "C", "D", "E"};

    for (String s : strArr) {
      System.out.println(s);
    }
    System.out.println(Arrays.toString(strArr));

    // 숫자(float)을 원소로 가지는 배열 fArr을 생성 = { ~, ~, ~ } 하면서 값을 초기화하세요.
    // fArr 배열의 원소를 전부 출력하라. (1. foreach 2. Arrays의 메서드를 활용 )
    float[] fArr = {0.1f, 1.1f, 2.1f};
    for (float v : fArr) {
      System.out.println(v);
    }
    System.out.println(Arrays.toString(fArr));
  }
}
