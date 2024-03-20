package day12.chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> car = List.of("그랜저","소나타","아반테","제네시스","소울");

    List<String> list = new ArrayList<>(car);
    System.out.println(list.size());

    list.add("싼타페");
    list.forEach(s -> System.out.print(s + " "));
    System.out.println(" ");

    if(list.contains("싼타페")) {
      System.out.println("싼타페는 " + list.indexOf("싼타페") + "번 index에 있습니다.");
    };

    list.replaceAll(s -> "뉴" + s);
    list.forEach(System.out::println);

    String removeItem = list.remove(3);
    System.out.println(removeItem);

    list.forEach(s -> System.out.print(s + " "));
    System.out.println(" ");

    boolean b = list.removeIf(s -> s.length() == 3);
    list.forEach(s -> System.out.print(s + " "));
    System.out.println(" ");



  }
}
