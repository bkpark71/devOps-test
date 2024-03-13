package day7.chapter6;

public class PolyDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Employee e = new Employee();
    Person p = s;  // 자동형변환, 업캐스팅
    System.out.println(p.name);
    p.whoami();
    //System.out.println(p.number);
    //p.work();
    check(p);
    check(s);
    check(e);
    Person person = new Person();

    Person[] people = new Person[3];
    people[0] = person;
    people[1] = s;
    people[2] = e;
  }

  static void check(Person p){
    System.out.println(p.name);
    p.whoami();
    System.out.println("check 입니다.");
  }
}
