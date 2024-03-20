package day12.chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonTest {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();

    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));

    set.add(new Person("나자바", 10));

    Iterator<Person> iterator = set.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
