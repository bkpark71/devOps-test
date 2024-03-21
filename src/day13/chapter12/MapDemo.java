package day13.chapter12;

import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
    s1.map(s -> s.toUpperCase())
        .forEach(Util::print);

    System.out.println("\n 문자에 포함된 숫자만을 취한 후 제곱한다.");
    Stream<String> s2 = Stream.of("a1", "a2", "a3");
    s2.map(s -> s.substring(1))
        .mapToInt(s -> Integer.parseInt(s))
        .map(i -> i*i)
        .forEach(Util::print);
  }
}
