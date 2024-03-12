package day6.chapter5;

public class ArgumentDemo {
  public static void main(String[] args) {
    if(args.length == 2){
      int cnt = Integer.parseInt(args[1]);
      nPrint(args[0], cnt);
    } else {
      System.out.println("매개변수의 숫자가 다릅니다.");
    }
  }

  private static void nPrint(String args1, int cnt) {
    for (int i = 0; i < cnt; i++) {
      System.out.println(args1);
    }
  }
}
