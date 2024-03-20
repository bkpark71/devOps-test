package day12.chapter11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals = {"사슴","호랑이","바다표범","곰"};
    List<String> animalList = Arrays.asList(animals);
    Iterator<String> animalIterator = animalList.iterator();
    while(animalIterator.hasNext()) {
      System.out.print(animalIterator.next() + " ");
    }
    System.out.println("");

    animalList.set(0, "앵무새");

    animalIterator = animalList.iterator();
    while(animalIterator.hasNext()) {
      System.out.print(animalIterator.next() + " ");
    }
    System.out.println("");

    //animalList.add(animalList.size() - 1, "사자");
    //System.out.println(animalList.remove(0));
    animalList.sort((s1, s2) -> s1.length() - s2.length());
    animalIterator = animalList.iterator();
    while(animalIterator.hasNext()) {
      System.out.print(animalIterator.next() + " ");
    }
    System.out.println("");

    animalList.sort((s1, s2) -> s2.length() - s1.length());
    animalIterator = animalList.iterator();
    while(animalIterator.hasNext()) {
      System.out.print(animalIterator.next() + " ");
    }
    System.out.println("");

    System.out.println(animalList.removeIf(s -> s.length() == 0));
    animalList.forEach(System.out::println);

    String[] animalArray = animalList.toArray(new String[4]);
    for (String s : animalArray) {
      System.out.print(s + " ");
    }
    System.out.println("");

    List<String> aList = List.of("a", "b", "c", "d");
    //aList.set(0,"f");
    aList.forEach(s -> System.out.println(s));
    aList.forEach(System.out::println);
  }
}
