package day10.chapter8;

import java.util.StringTokenizer;

public class TokenizerDemo {
  public static void main(String[] args) {
    String s = """
    of the people,
    by the people,  for the people""";

    StringTokenizer st = new StringTokenizer(s, " \t\n,");
    System.out.println(st.countTokens());
    while(st.hasMoreTokens()) {
      System.out.print("["+st.nextToken()+"]");
    }
    System.out.println();

    st = new StringTokenizer(s, " \t\n,");
    System.out.println(st.countTokens());
    while(st.hasMoreTokens()) {
      System.out.print("["+st.nextToken()+"]");
    }
    System.out.println();
  }
}
