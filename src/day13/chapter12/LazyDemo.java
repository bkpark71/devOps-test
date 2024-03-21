package day13.chapter12;

import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);
    intStream
        .filter(i -> {
          System.out.println(i);
          return i % 2 == 0;
        })
        .map(i -> {
          System.out.println(i * i);
          return i * i;
        })
        .forEach(System.out::println);

    IntStream ints = new Random().ints(1, 100);
    ints.filter(i -> {
          System.out.println(i);
          return i % 2 == 0;
        }).limit(5)
        .forEach(System.out::println);
  }
}
