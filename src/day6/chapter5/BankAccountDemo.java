package day6.chapter5;

import day4.exercise.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();
    int menu;
    String accountNo , password, name ;
    Account account;
    long amount;
    do {
      System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 잔고 5. 종료");
      menu = in.nextInt(); in.nextLine();
      switch (menu) {
        case 1:
          System.out.println("계좌 생성");
          System.out.print("계좌번호(숫자 5자리) : ");
          accountNo = in.nextLine();
          System.out.print("암호(숫자 4자리) : ");
          password = in.nextLine();
          System.out.print("예금주명 : ");
          name = in.nextLine();
          account = new Account(accountNo, password, name, 0L);
          accounts.add(account);
          break;
        case 2:
          System.out.println("입금>");
          System.out.print("계좌번호 : ");
          accountNo = in.nextLine();
          for (Account account1 : accounts) {
            if(account1.getAccountNo().equals(accountNo)) {
              System.out.print("입금액 : ");
              amount = in.nextLong(); in.nextLine();
              account1.deposit(amount);
            }
          }
          break;
        case 3:
          System.out.println("출금>")
          ;
          break;
        case 4:
          System.out.println("잔고>");
          break;
        case 5:
          System.out.println("종료>");
          break;
      }
    } while (menu != 5);
    
    // accounts 에 들어있는 모든 계좌정보를 출력
    for (Account account1 : accounts) {
      System.out.println(account1.getAccountNo());
      System.out.println(account1.getName());
      System.out.println(account1.getBalance());
    }
  }
}
