package day13.chapter12;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    // sort - 비교대상이 int, Integer 인 경우
    Stream<Integer> integerStream = Stream.of(3, 7, 1, 4, 8, 10);
    integerStream.sorted(Comparator.reverseOrder())
        .forEach(Util::print);

    IntStream intStream = IntStream.of(3, 7, 1, 4, 8, 10);
   //intStream.sorted(Comparator.reverseOrder())
    intStream.boxed().sorted(Collections.reverseOrder())
        .forEach(Util::print);

    System.out.println("");
    Stream<Nation> n1 = Nation.nations.stream();
    n1.sorted(Comparator.comparing(nation -> nation.getGdpRank()))
        .map(nation -> nation.getName() + "," + nation.getGdpRank())
        .forEach(Util::printWithParenthesis);

    // 인구가 많은 나라 순으로 나라이름과 인구를 출력하기
    System.out.println("");
    Stream<Nation> n2 = Nation.nations.stream();
    n2.sorted(Comparator.comparing(Nation::getPopulation).reversed())
        .map(nation -> nation.getName() + "," + nation.getPopulation())
        .limit(5)
        .forEach(Util::printWithParenthesis);
  }
}
