package day13.chapter12;

import java.util.Optional;

public class MatchDemo {
  public static void main(String[] args) {
    if(Nation.nations.stream()
        .allMatch(nation -> nation.getPopulation() > 100.0)) {
      System.out.println("모든 국가의 인구가 1억이 넘는다.");
    } else {
      System.out.println("모든 국가의 인구가 1억이 넘지 않는다.");
    }

    // 섬인 나라중에서 나라의 이름만 출력하기
    Optional<Nation> any =  Nation.nations.stream()
        .filter(nation -> nation.isIsland())
        .findAny();
    System.out.println(any);
    any.ifPresentOrElse(n -> Util.print(n.getName()), () -> System.out.println("없음"));

    // 맨처음에 나오는 나라의 이름만 출력하기 (findFirst)
    Optional<Nation> first = Nation.nations.stream().findFirst();
    first.ifPresent(n -> Util.print(n.getName()));
  }
}
