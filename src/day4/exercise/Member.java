package day4.exercise;

public class Member {
  // 연습문제 13번
  // 현실 세계의 회원을 Member 클래스로 모델링하려고 한다.
  // 회원의 데이터는 이름, 아이디, 패스워드, 나이가 있다.
  // 이 데이터를 가지는 Member 클래스를 선언하라.
  String name;
  String id;
  String password;
  int age;

  // 생성자
  public Member(String name, String id) {
    this.name = name;
    this.id = id;
  }

  // 메서드
  boolean login(String id, String password){
    if(id.equals("hong") && password.equals("12345")){
      return true;
    }
    return false;
  }

  boolean logout(String id){
    if(id.equals("hong")) {
      return true;
    }
    return false;
  }
}
