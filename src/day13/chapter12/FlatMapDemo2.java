package day13.chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo2 {
  public static void main(String[] args) {
    List<String> sList = List.of("안녕, 자바", "잘 가, C++!");
    Stream<String> s1 = sList.stream();
    s1.flatMap(s-> Arrays.stream(s.split(" ")))
        .forEach(Util::printWithParenthesis);

    System.out.println("");
    List<String> l1 = List.of("Good Morning");
    List<String> l2 = List.of("hello world", "welcome, stream!");

    Stream<List<String>> sList1 = Stream.of(sList, l1, l2);
    sList1.flatMap(list -> {
      if(list.size() > 1)
        return list.stream();
      else
        return Stream.empty();
    }).forEach(Util::printWithParenthesis);

  }
}
