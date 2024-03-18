package day9.chapter7;

public interface Human {
  void eat();
  static void echo(){
    System.out.println("야호!");
  }
  default void print() {
    System.out.println("인간입니다.");
  }
}

class Worker implements Human {
  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
}

class Student implements Human {
  int age;
  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }

  @Override
  public void print() {
    System.out.println(age + "세의 학생입니다.");
  }

  public Student(int age) {
    this.age = age;
  }
}