package day3.chapter3;

public class Ex2 {
  public static void main(String[] args) {
    long res1 = plus(10,20);
    System.out.println(res1);
    long res2 = minus(10,20);
    System.out.println(res2);
    long res3 = multiply(10,20);
    System.out.println(res3);
    double res4 = divide(10,20);
    System.out.println(res4);
    res4 = divide(10L, 20L);
    System.out.println(res4);
    res4 = divide(10.0,20.0);
    System.out.println(res4);
    int result = divideInt(10,20);
    System.out.println(result);
    result = divideInt(10L,20L);
    System.out.println(result);
    System.out.printf("%d %d", 10, 20);
    System.out.printf("%s %s %d", "hello", "world", 20);
  }

  private static long plus(int num1, int num2) {
    return num1 + num2;
  }

  private static long minus(int num1, int num2) {
    return num1 - num2;
  }

  private static long multiply(int num1, int num2) {
    return num1 * num2;
  }

  private static int divideInt(int num1, int num2) {
    if (num2 != 0) {
      return num1 / num2;
    }
    return -1;
  }

  private static int divideInt(long num1, long num2) {
    if (num2 != 0) {
      return (int)num1 / (int)num2;
    }
    return -1;
  }
  private static double divide(int num1, int num2) {
    if (num2 != 0) {
      return (double)num1 / num2;
    }
    return -1;
  }

  private static double divide(double num1, double num2) {
    if (num2 != 0) {
      return num1 / num2;
    }
    return -1;
  }

  private static double divide(long num1, long num2) {
    if (num2 != 0) {
      return (double)num1 / num2;
    }
    return -1;
  }
}
