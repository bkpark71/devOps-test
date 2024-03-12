package day2.chapter3;

public class ForDemo {
  public static void main(String[] args) {
    int num = 0;
    num += 1;
    num += 1;
    num += 1;
    num += 1;
    num += 1;
    System.out.println(num);

    num = 0;
    for (int i = 0; i < 5; i++) {
      num += 1;
    }
    System.out.println(num);

    int i = 0;
    num = 0;
    while(i < 5){
      num += 1;
      i++;
    }
    System.out.println(num);
  }
}
