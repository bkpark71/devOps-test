package day13.chapter12;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FinalDemo {
  public static void main(String[] args) {
    OptionalInt min = IntStream.of(5, 1, 2, 3).min();
    System.out.println(min);
    System.out.println(min.getAsInt() + 10);

    System.out.println(IntStream.of(5, 1, 2, 3).max().getAsInt() + 10);
    System.out.println(IntStream.of(5, 1, 2, 3).count() + 10);
    System.out.println(IntStream.of(5, 1, 2, 3).sum() + 10);
    System.out.println(IntStream.of(5, 1, 2, 3).average().getAsDouble() + 10);
  }
}
