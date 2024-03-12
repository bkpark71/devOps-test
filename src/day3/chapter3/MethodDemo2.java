package day3.chapter3;

public class MethodDemo2 {
  public static void main(String[] args) {
    System.out.println(sum(0, 10));
    System.out.println(sum(10, 100));
    System.out.println(sum(100,1000));
  }

  public static int sum(int num1, int num2) {
    int sum = 0;
    for (int i = num1 ; i <= num2 ; i++) {
      sum += i;
    }
    return sum;
  }


}
