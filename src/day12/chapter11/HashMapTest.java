package day12.chapter11;

import java.util.HashMap;

public class HashMapTest {
  public static void main(String[] args) {
    HashMap<String, String> animals = new HashMap<>();
    animals.put("호랑이", "tiger");
    animals.put("표범", "leopard");
    animals.put("사자", "lion");

    System.out.println(animals);
    animals.replaceAll((k,v) -> v.toUpperCase());
    System.out.println(animals);
  }
}
