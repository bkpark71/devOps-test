package day6.chapter5;

public class VarLengthDemo {
  public static void main(String[] args) {
    sumNPrint(1);
    sumNPrint(1,2);
    sumNPrint(1,2,3);
    sumNPrint(1,2,3,4);

    System.out.printf("%d, %d, %d",10,10,10);
    System.out.printf("%d, %d",10,10);
  }

  public static void sumNPrint(int... v){
    int sum = 0;
//    for (int i = 0; i < v.length ; i++) {
//      sum+=v[i];
//    }
    for (int i : v) {
      sum += i;
    }
    System.out.println(sum);
  }
}
