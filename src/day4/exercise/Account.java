package day4.exercise;

public class Account {
  // 계좌번호,비밀번호, 이름, 잔액
  private String accountNo; // 숫자5자리
  private String password; // 숫자4자리
  private String name; //예금주 이름
  private long balance; // 잔액

  public void deposit(long amount) {
    balance += amount;
  }

  public void withdraw(long amount){
    if(amount > balance){
      System.out.println("출금오류");
    } else {
      balance -= amount;
    }
  }

  public void checkBalance(){
    System.out.println("현재 계좌의 잔액은 " + getBalance() + "입니다.");
  }
  public String getAccountNo() {
    return accountNo;
  }

  public String getPassword() {
    return password;
  }

  public String getName() {
    return name;
  }

  public long getBalance() {
    return balance;
  }
  // 생성자
  public Account(String accountNo, String password, String name, long balance) {
    this.accountNo = accountNo;
    this.password = password;
    this.name = name;
    this.balance = balance;
  }
}

//class Sample {}
