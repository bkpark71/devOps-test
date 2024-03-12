package day4.exercise;

import java.util.Scanner;

public class MemberDemo {
  public static void main(String[] args) {
    // Member 클래스를 이용해서 Memeber를 생성하고, 로그인 후 로그인에 성공하면 로그아웃 하는
    // 프로그램을 만드세요.
    Scanner in = new Scanner(System.in);
    System.out.print("아이디를 입력하세요 : ");
    String id = in.nextLine();
    System.out.print("패스워드를 입력하세요 : ");
    String password = in.nextLine();

    Member member = new Member("홍길동", "hong");
    if(member.login(id, password)){
      System.out.println("로그인에 성공했습니다.");
      if(member.logout(id)){
        System.out.println("로그아웃에 성공했습니다.");
      } else {
        System.out.println("로그아웃에 실패했습니다.");
      }
    } else {
      System.out.println("로그인에 실패했습니다.");
    }
  }
}
