package day13.chapter12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionDemo {
  public static void main(String[] args) {
    Stream<Nation> sn = Nation.nations.stream().limit(4);
    Map<Boolean, List<Nation>> collect = sn.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND));
    System.out.println(collect);

    sn = Nation.nations.stream().limit(4);
    Map<Boolean, Long> collect1 = sn.collect(Collectors.partitioningBy(
        n -> n.getType() == Nation.Type.LAND,
        Collectors.counting()
    ));
    System.out.println(collect1);
  }
}
