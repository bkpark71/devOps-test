package day11.chapter9;

import java.util.StringTokenizer;

public class UncheckedDemo1 {
  public static void main(String[] args) {
    String s = "time is money";

    StringTokenizer st = new StringTokenizer(s, " ,");
    while(st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
    st.nextToken();
  }
}
