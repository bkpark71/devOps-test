package day13.chapter12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(r.nextInt(30));
    }
    // 기존의 방식으로 10보다 큰 것만 뽑은 후 정렬해서 출력
    List<Integer> gt10 = new ArrayList<>();
    for (Integer i : list) {
      if(i > 10)
        gt10.add(i);
    }
    Collections.sort(gt10);
    System.out.println(gt10);

    // 스트림을 이용해서 10보다 큰 것만 뽑은 후 정렬해서 출력
    list.stream()
        .filter(i -> i > 10)
        .sorted()
        .forEach(x -> System.out.println(x));
  }
}
