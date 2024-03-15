package day9.chapter7;

import java.util.Arrays;

public class PersonTest {
  public static void main(String[] args) {
    Person[] people = {
        new Person(40,175,68,"박지성"),
        new Person(32,175,68,"홍길동"),
        new Person(20,175,68,"손흥민")
    };

    Arrays.sort(people);

    for (Person person : people) {
      System.out.println(person);
    }
  }
}
