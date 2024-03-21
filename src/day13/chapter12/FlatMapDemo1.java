package day13.chapter12;

import java.util.stream.Stream;

public class FlatMapDemo1 {
  public static void main(String[] args) {
    Stream<Nation> n1 = Nation.nations.stream();
    System.out.println("나라 이름 4개 출력하기");
    n1.map(Nation::getName)
        .limit(4)
        .forEach(Util::printWithParenthesis);

    Stream<Nation> n2 = Nation.nations.stream();
    System.out.println("\n모든 나라의 gdpRank를 출력하기");
    n2.map(nation -> nation.getGdpRank())
        .forEach(Util::print);
  }
}
