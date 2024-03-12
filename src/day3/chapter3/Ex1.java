package day3.chapter3;

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    accountManagement();
  }

  public static void accountManagement() {
    Scanner in = new Scanner(System.in);
    long account = 0L;
    int menu = 0;
    int amount = 0;

    do {
      //1. 안내메시지 출력
      System.out.println("==============================");
      System.out.println("1. 입금 2. 출금 3. 잔고 4. 종료");
      System.out.println("==============================");
      //2. 메뉴 입력받는다.
      menu = in.nextInt();
      //3. 입금처리 / 출금처리 / 잔고 / 종료
      if (menu == 1) {
        // 입금할 금액을 입력받는다.
        // 입력받은 금액을 잔고에 더한다.
        System.out.print("입금 > ");
        amount = in.nextInt();
        account += amount;
      } else if (menu == 2) {
        System.out.print("출금 > ");
        // 출금할 금액을 입력받는다.
        amount = in.nextInt();
        // 입력받은 금액을 잔고에서 뺀다. 단 잔고보다 큰 금액은 출력할 수 없다.
        if (account < amount) {
          System.out.println("잔액이 부족합니다.");
        } else {
          account -= amount;
        }
      } else if (menu == 3) {
        // 잔고를 출력한다.
        System.out.printf("현재 계좌의 잔액은 %d 입니다.\n", account);
      } else if (menu == 4) {
        System.out.println("프로그램 종료 !!!");
      } else {
        System.out.println("메뉴번호를 확인하고 재입력하세요 !!!");
      }
    } while (menu != 4) ;
  }
}
