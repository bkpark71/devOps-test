package day13.chapter12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EtcStreamDemo {
  public static void main(String[] args) {
    IntStream iterate = IntStream.iterate(100, i -> i + 2);
//    iterate.forEach(System.out::println);
    IntStream ints = new Random().ints(1, 100);
//    ints.forEach(System.out::println);
    Stream<Double> generate = Stream.generate(Math::random);
//    generate.forEach(System.out::println);
    IntStream range = IntStream.range(1, 5);
    range.forEach(System.out::println);
    IntStream rangeClosed = IntStream.rangeClosed(1, 5);
    rangeClosed.forEach(System.out::println);
  }
}
