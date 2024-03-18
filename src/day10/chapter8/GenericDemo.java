package day10.chapter8;

import java.util.ArrayList;

public class GenericDemo {
  public static void main(String[] args) {
    ArrayList<Integer> ai = new ArrayList<>();
    ai.add(10);
    //ai.add("abc");
    //if(ai.get(0) instanceof Integer i)
    Integer i = ai.get(0) + 10;
    System.out.println(i);

    ArrayList<String> as = new ArrayList<>();
    as.add("abc");
    //as.add(10);
    String s = as.get(0) + "def";
    System.out.println(s);

    ArrayList ao = new ArrayList<>();
    ao.add(1);
    ao.add("abc");
    ao.add(3.14);

    Object o = ao.get(1);
    if(ao.get(1) instanceof String) {
      String s1 = (String)ao.get(1);
    }
      ;
  }
}
