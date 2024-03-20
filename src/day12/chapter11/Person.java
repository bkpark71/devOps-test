package day12.chapter11;

public class Person {
  private String name;
  private int age;

  public Person(String name,int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person[" + name + ":" + age + "]";
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0 ;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person p)
      return this.name.equals(p.name);
    return false;
  }
}
