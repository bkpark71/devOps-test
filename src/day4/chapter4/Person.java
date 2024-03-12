package day4.chapter4;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public void sayHello(){
    System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다.");
  }
}
