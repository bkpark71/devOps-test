package day7.chapter5;

public class VarLenghDemo2 {
  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4));
    int[] arr = {2,3};
    System.out.println(sum(1,arr));
    System.out.println(sum(1,2,3,4,5));
  }

  static int sum(int number, int... num){
    int sum=0;
//    for (int i = 0; i < num.length ; i++) {
//      sum += num[i];
//    }
    for (int i : num) {
      sum += i;
    }
    return sum;
  }
}
