package day12.chapter11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String,Integer> map = Map.of("apple", 4, "banana", 10,"cherry", 3, "mango", 10);
    System.out.println(map);
    map.forEach((k,v) -> System.out.print(k + "=" + v + " "));
    System.out.println(map.size() + "종류의 과일이 있습니다.");

    HashMap<String, Integer> hashMap = new HashMap<>(map);
    System.out.println(hashMap.size() + "종류의 과일이 있습니다.");
    hashMap.put("apple", 10);
    System.out.println(hashMap);

    hashMap.put("blueberry", 20);
    System.out.println(hashMap);

    hashMap.remove("apple");
    System.out.println(hashMap);

    hashMap.clear();
    System.out.println(hashMap.size());
  }
}
