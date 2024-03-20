package day12.chapter11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("apple", "banana", "cherry", "mango");
    HashSet<String> hashSet = new HashSet<>(set);
    System.out.println(hashSet);

    hashSet.add("apple");
    System.out.println(hashSet);

    hashSet.add("blueberry");
    System.out.println(hashSet);

    TreeSet<String> treeSet = new TreeSet<>(set);
    System.out.println(treeSet);

    System.out.println(treeSet.first());
    System.out.println(treeSet.last());

    treeSet.add("apple");
    System.out.println(treeSet);

    treeSet.add("blueberry");
    System.out.println(treeSet);
    System.out.println(treeSet.lower("cherry"));
    System.out.println(treeSet.higher("cherry"));

  }
}
