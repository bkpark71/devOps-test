package day8.chapter6;

public class PersonPolyDemo {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    people[0] = new Person("길동이", 22);
    people[1] = new Student("황진이", 23, "100");
    people[2] = new ForeignStudent("Amy", 30, "200", "U.S.A");

  // person 타입 배열 원소를 for~each 문을 사용해 출력
    for (Person p : people) {
      System.out.println(p.show());
    }
  }
}
