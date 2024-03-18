package day10.chapter8;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j', 'a', 'v', 'a'};
    char[] a2 = Arrays.copyOf(a1, a1.length);
    System.out.println(a1);
    System.out.println(a2);

    String[] s1 = {"케이크", "애플", "도넛", "바나나"};
    System.out.println(s1);
    print(s1);

    System.out.println(Arrays.binarySearch(s1,"애플"));
    Arrays.fill(s1, 2, 4, "기타");
    print(s1);
    System.out.println(Arrays.toString(s1));
  }

  private static void print(String[] s1) {
    for (String s : s1) {
      System.out.print(s + " ");
    }
    System.out.println(" ");
  }
}
