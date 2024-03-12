package day4.chapter4;

public class PersonDemo {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("민국");
    person.setAge(21);
    person.sayHello();

    person.setName("민국").setAge(21).sayHello();
  }
}
