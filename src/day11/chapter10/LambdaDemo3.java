package day11.chapter10;

public class LambdaDemo3 {
  public static void main(String[] args) {
    method1((a,b) -> a < b ? a : b);
    Myfunction f = method2();
    System.out.println(f.min(4,2));
  }

  static void method1(Myfunction f) {
    System.out.println(f.min(3,5));
  }

  static Myfunction method2() {
    return (a,b) -> a < b ? a : b;
  }
}
