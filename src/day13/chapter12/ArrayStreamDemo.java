package day13.chapter12;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamDemo {
  public static void main(String[] args) {
    int[] iarr = {2,4,6,8,10};
    IntStream iStream = Arrays.stream(iarr);
    IntStream iarr1 = IntStream.of(iarr);
    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

    String[] sarr = {"a","b","c"};
    Stream<String> sarr1 = Stream.of(sarr);
    
    double[] darr = {1.2, 3.14, 5.9};
    DoubleStream stream = Arrays.stream(darr);
    DoubleStream darr1 = DoubleStream.of(darr);
    Stream.of(1.2, 3.14, 5.9);
  }
}
