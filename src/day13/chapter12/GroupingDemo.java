package day13.chapter12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDemo {
  public static void main(String[] args) {
    Stream<Nation> s1 = Nation.nations.stream().limit(4);
    Map<Nation.Type, List<Nation>> collect = s1.collect(Collectors.groupingBy(n -> n.getType()));
    System.out.println(collect);

    Stream<Nation> s2 = Nation.nations.stream().limit(4);
    Map<Nation.Type, Long> collect1 = s2.collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));
    System.out.println(collect1);

    s2 = Nation.nations.stream().limit(4);
    Map<Nation.Type, String> collect2 = s2.collect(Collectors.groupingBy(Nation::getType,
        Collectors.mapping(Nation::getName, Collectors.joining("#"))));
    System.out.println(collect2);
  }
}
