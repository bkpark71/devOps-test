package day3.chapter3;

public class ParamDemo {
  public static void main(String[] args) {
    int n = 0;
    System.out.println("main (시작) : " + n);
    increment(n);
    System.out.println("main (종료) : " + n);
  }

  private static void increment(int n){
    System.out.println("메서드 내부 (시작) : " + n);
    n++;
    System.out.println("메서드 내부 (종료) : " + n);
  }
}
