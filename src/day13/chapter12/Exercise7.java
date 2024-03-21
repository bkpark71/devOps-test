package day13.chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", "개발자"),
        new Member("김나라", "디자이너"),
        new Member("신용권", "개발자")
    );

    // 스트림을 이용해 직업이 개발자인 사람만 별도의 리스트에 수집하라.
    List<Member> 개발자 = list.stream()
        .filter(m -> m.getJob().equals("개발자"))
        .collect(Collectors.toList());

    System.out.println("개발자");
    개발자.stream()
        .forEach(m -> System.out.println(m.getName()));
  }

}

class Member {
  private String name;
  private String job;

  public Member(String name, String job) {
    this.name = name;
    this.job = job;
  }

  public String getName() {
    return name;
  }

  public String getJob() {
    return job;
  }

  @Override
  public String toString() {
    return "Member{" +
        "name='" + name + '\'' +
        ", job='" + job + '\'' +
        '}';
  }
}