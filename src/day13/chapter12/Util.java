package day13.chapter12;

public class Util {
  public static <T> void print(T t) {
    System.out.print(t + " ");
  }

  public static <T> void println(T t) {
    System.out.println(t);
  }

  public static <T> void printWithParenthesis(T t) {
    System.out.print("(" + t + ")");
  }

  public static <T> void printWithParenthesisln(T t) {
    System.out.println("(" + t + ")");
  }
}
