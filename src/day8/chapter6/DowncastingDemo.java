package day8.chapter6;

import day7.chapter6.Employee;
import day7.chapter6.Freelancer;
import day7.chapter6.Person;
import day7.chapter6.Student;

public class DowncastingDemo {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    Student student = new Student();
    Employee employee = new Employee();
    Freelancer freelancer = new Freelancer();
    people[0] = student;
    people[1] = employee;
    people[2] = freelancer;

    for (Person person : people) {
      if(person instanceof Student s) {
        System.out.println(s.name);
        System.out.println(s.number);
        s.work();
      } else if (person instanceof Employee) {
        Employee e = (Employee) person;
        System.out.println(e.name);
        System.out.println(e.number);
        e.work();
      } else if (person instanceof Freelancer){
        System.out.println(person.name);
        System.out.println(((Freelancer) person).number);
        ((Freelancer) person).work();
      }
    }
  }
}

