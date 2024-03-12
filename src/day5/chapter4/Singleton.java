package day5.chapter4;

public class Singleton {
  // static 멤버(필드,메서드)
  private static Singleton singleton = new Singleton();
  // 생성자
  private Singleton() {

  }
  // 접근자(게터)
  public static Singleton getSingleton() {
    return singleton;
  }
}
