package day6.chapter5;

public class ForEachDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int sum = 0;
    // foreach 문으로 짝수만 더하기
    for (int i : arr) {
      if(i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
    // foreach 문으로 홀수만 더하기
    sum= 0;
    for (int i : arr) {
      if(i % 2 == 1) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
