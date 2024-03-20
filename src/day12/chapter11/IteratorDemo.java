package day12.chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> list = Arrays.asList("abc", "def", "ghi");

    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    iterator = list.iterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
