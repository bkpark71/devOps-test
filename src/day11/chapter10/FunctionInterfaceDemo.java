package day11.chapter10;

import java.util.Comparator;

public class FunctionInterfaceDemo {
  public static void main(String[] args) {
    Comparator<String> c = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.length() - o2.length();
      }
    };


    System.out.println(c.compare("hello", "a"));

    Comparator<String> c1 = (o1, o2) -> o1.length() - o2.length();
    System.out.println(c1.compare("abcde","1928374918273491823749"));
  }
}
