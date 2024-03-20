package day12.chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
  public static void main(String[] args) {
    List<String> list = List.of("갈매기","나비","다람쥐","라마");
    ArrayList<String> animals = new ArrayList<>(list);

    animals.add("동물");
    for (String animal : animals) {
      if(animal.length() == 2) {
        System.out.println(animal);
      }
    }
  }
}
