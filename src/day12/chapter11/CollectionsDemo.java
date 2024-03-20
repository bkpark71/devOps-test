package day12.chapter11;

import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("cherry","apple","banana","mango");

    System.out.println(list);
    Collections.sort(list, Collections.reverseOrder());
    Collections.sort(list);
    System.out.println(list);

    Collections.sort(list, (s, s1) -> s1.compareTo(s));
    System.out.println(list);

    //Collections.reverse(list);

    System.out.println(list);

    List<Character> cList = new ArrayList<>();

    for (char c = 'A'; c <= 'G'; c++) {
      cList.add(c);
    }

    System.out.println("list : " + cList);
    Collections.rotate(cList, 3);
    System.out.println("rotate된 list : " + cList);
    Collections.shuffle(cList);// 같은 메서드 호출
    System.out.println("shuffle된 list : " + cList);
    Collections.shuffle(cList, new Random()); // 같은 메서드 호출
    System.out.println("랜덤 shuffle된 list : " + cList);


    Collections.sort(cList);
    int a = Collections.binarySearch(cList, 'C');// 정렬된 배열에서 사용할 수 있음
    System.out.println(a);
    System.out.println(cList.get(a));
  }
}
