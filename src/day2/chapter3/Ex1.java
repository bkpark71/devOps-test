package day2.chapter3;

public class Ex1 {
  public static void main(String[] args) {
    // 1 부터 100 까지의 정수 중에서 짝수의 총합(sum)을 출력하는 문제
//    int sum = 0;
//    sum += 2;
//    sum += 4;
//    sum += 6;
//    sum += 8;
//    sum += 10;
//    sum += 12;
//    (생략)
//    sum += 100;

    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.printf("1부터 100사이의 짝수의 총합은 %d 입니다.\n", sum);

    sum = 0;
    for (int i = 2; i <= 100; i += 2) {
      sum += i;
    }
    System.out.printf("1부터 100사이의 짝수의 총합은 %d 입니다.\n", sum);

    sum = 0;
    int i = 0;
    while (i <= 100) {
      sum += i;
      i += 2;
    }
    System.out.printf("1부터 100사이의 짝수의 총합은 %d 입니다.\n", sum);

    sum = 0;
    i = 0;
    while (i <= 100) {
      if (i % 2 == 0) {
        sum += i;
      }
      i++;
    }
    System.out.printf("1부터 100사이의 짝수의 총합은 %d 입니다.", sum);
  }
}
