package day5.chapter4;

import day4.exercise.Circle;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getSingleton();
    Singleton singleton2 = Singleton.getSingleton();

    System.out.println(singleton);
    System.out.println(singleton2);

    if(singleton == singleton2) {
      System.out.println("두 객체는 동일한 singleton 객체입니다.");
    }

    Circle c1 = new Circle(10,"빨간");
    Circle c2 = new Circle(100, "흰");

    System.out.println(c1);
    System.out.println(c2);



  }
}
