package day4.exercise;

import java.util.Scanner;

public class AccountDemo {
  public static void main(String[] args) {
    Account account = accountCreate();
    accountManagement(account);
  }

  private static Account accountCreate(){
    Account account = new Account("11111", "1111", "홍길동", 100000);
    return account;
  }
  private static void accountManagement(Account account) {
    Scanner in = new Scanner(System.in);
    System.out.println("계좌번호와 비밀번호를 입력하세요");
    String accountNo = in.nextLine();
    String password = in.nextLine();
    long amount;
    if (account.getAccountNo().equals(accountNo)) {
      if (account.getPassword().equals(password)) {
        System.out.println("1. 입금, 2. 출금, 3. 잔고확인 4. 종료");
        int menu = in.nextInt();
        switch (menu) {
          case 1 :
            System.out.print("입금 > ");
            amount = in.nextLong();
            account.deposit(amount);
            account.checkBalance();
            break;
          case 2 :
            System.out.print("출금 > ");
            amount = in.nextLong();
            account.withdraw(amount);
            account.checkBalance();
            break;
          case 3 :
            System.out.print("잔액조회 > ");
            account.checkBalance();
            break;
          case 4 :
            System.out.print("종료 > ");
            break;
          default:
            System.out.println("메뉴 번호 확인 후 재입력 바랍니다.");
        }
      } else {
        System.out.println("계좌 비밀번호 오류");
      }
    } else {
      System.out.println("계좌번호 오류");
    }
  }
}
