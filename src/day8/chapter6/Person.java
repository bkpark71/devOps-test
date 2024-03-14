package day8.chapter6;

public class Person {
  private String name;
  private int age;
  // 접근자
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // 생성자
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 메서드
  String show(){
    return "사람[" +
        "이름 :'" + name + '\'' +
        ", 나이 :" + age +
        ']';
  }
}
