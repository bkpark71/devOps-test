package day9.chapter7;

public class Person implements Comparable{
  int age, height, weight;
  String name;

  public Person(int age, int height, int weight, String name) {
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person[" +
        "이름=" + name +
        ", 나이=" + age +
        ", 키=" + height +
        ", 몸무게=" + weight +
        ']';
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Person p) {
      return p.age - this.age;
    }
    return -999999999;
  }
}
