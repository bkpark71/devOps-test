package day8.chapter6;

import day7.chapter6.Employee;
import day7.chapter6.Person;
import day7.chapter6.Student;

public class InstanceofDemo {
  public static void main(String[] args) {
    Person person = new Person();
    Student student = new Student();
    Employee employee = new Employee();

    //student = (Student)Person;

    System.out.println(person.name);
    person.whoami();
    System.out.println(person instanceof Person);
    System.out.println(person instanceof Object);
    System.out.println(person instanceof Student);

    System.out.println(student instanceof Student);
    System.out.println(student instanceof Person);
    System.out.println(student instanceof Object);
    //System.out.println(student instanceof String);

    downcast(person);
    downcast(student);
    downcast(employee);
  }

  static void downcast(Person p) {
    if(p instanceof Student){
      Student s = (Student)p;
      System.out.println("다운캐스팅 성공");
    } else if(p instanceof Employee) {
      Employee e = (Employee)p;
      System.out.println("다운캐스팅 성공");
    } else {
      System.out.println("다운캐스팅 실행 종료");
    }
  }
}
