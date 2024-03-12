package day6.chapter5;

import day4.exercise.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountArrayDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();
    int menu;
    String accountNo, password, name;
    int amount;
    boolean accountFound;
    do {
      System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 잔고 5. 종료");
      menu = in.nextInt();
      in.nextLine();
      switch (menu) {
        case 1:
          //System.out.println("계좌생성");
          System.out.print("계좌번호 : ");
          accountNo = in.nextLine();
          System.out.print("비밀번호 : ");
          password = in.nextLine();
          System.out.print("예금주명 : ");
          name = in.nextLine();
          if ((!accountNo.isEmpty() && !accountNo.isBlank() && accountNo.length() == 5) &&
              (!password.isEmpty() && !password.isBlank() && password.length() == 4) &&
              (!name.isEmpty() && !name.isBlank())) {
            accounts.add(new Account(accountNo, password, name, 0));
          }
          break;
        case 2:
          System.out.println("입금> 계좌번호를 입력하세요. ");
          accountNo = in.nextLine();
          accountFound = false;
          for (Account account : accounts) {
            if (account.getAccountNo().equals(accountNo)) {
              System.out.println("암호를 입력하세요");
              password = in.nextLine();
              if (account.getPassword().equals(password)) {
                System.out.println("입금액을 입력하세요");
                accountFound = true;
                amount = in.nextInt();
                in.nextLine();
                account.deposit(amount);
              }
            }
            if (!accountFound) {
              System.out.println("유효하지 않은 계좌번호이거나 암호 오류입니다.");
            }
          }
          break;
        case 3:
          //System.out.println("출금처리");
          System.out.println("출금> 계좌번호를 입력하세요. ");
          accountNo = in.nextLine();
          accountFound = false;
          for (Account account : accounts) {
            if (account.getAccountNo().equals(accountNo)) {
              System.out.println("암호를 입력하세요");
              password = in.nextLine();
              if (account.getPassword().equals(password)) {
                System.out.println("출금액을 입력하세요");
                accountFound = true;
                amount = in.nextInt();
                in.nextLine();
                account.withdraw(amount);
              }
            }
          }
          if (!accountFound) {
            System.out.println("유효하지 않은 계좌번호이거나 암호 오류입니다.");
          }
          break;
        case 4:
          System.out.println("잔고조회> 계좌번호를 입력하세요. ");
          accountNo = in.nextLine();
          accountFound = false;
          for (Account account : accounts) {
            if (account.getAccountNo().equals(accountNo)) {
              System.out.println("암호를 입력하세요");
              password = in.nextLine();
              if (account.getPassword().equals(password)) {
                accountFound = true;
                account.checkBalance();
              }
            }
          }
          if (!accountFound) {
            System.out.println("유효하지 않은 계좌번호이거나 암호 오류입니다.");
          }
          break;
        case 5:
          System.out.println("종료");
          break;
        default:
          System.out.println("메뉴 확인후 재입력");
      }
    } while (menu != 5);

    for (Account account : accounts) {
      System.out.println(account.getAccountNo());
      System.out.println(account.getBalance());
      System.out.println(account.getName());
    }
  }
}
