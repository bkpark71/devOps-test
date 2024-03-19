package day11.chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo2 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(9,7,5,3);
//    Collections.sort(list); // ascending order
//    for (Integer i : list) {
//      System.out.println(i);
//    }
//
    Collections.sort(list, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });

    Collections.sort(list,(o1,o2) -> o2 - o1);
    for (Integer i : list) {
      System.out.println(i);
    }

    List<String> list2 = Arrays.asList("abc", "bbb" , "aaa", "ccc", "ddd");
    Collections.sort(list2);
    for (String s : list2) {
      System.out.println(s);
    }
//    Collections.sort(list2, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o2.compareTo(o1);
//      }
//    });

    Collections.sort(list2,(o1, o2) -> o2.compareTo(o1));
    for (String s : list2) {
      System.out.println(s);
    }
  }
}
