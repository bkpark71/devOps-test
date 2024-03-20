package day12.chapter11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
  public static void main(String[] args) {
//    HashMap<String, String> animals = new HashMap<>();
//    animals.put("호랑이", "tiger");
//    animals.put("표범", "leopard");
//    animals.put("사자", "lion");

    Map<String, String> map = Map.of(
            "호랑이", "tiger",
            "표범", "leopard",
            "사자", "lion");

    HashMap<String, String> animals = new HashMap<>(map);

    System.out.println(animals);
    animals.replaceAll((k,v) -> v.toUpperCase());
    System.out.println(animals);
  }
}
