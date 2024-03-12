package day4.chapter4;

public class ClassVarDemo {
  public static void main(String[] args) {
    System.out.println(StaticVarClass.number);
    StaticVarClass.method1();

    StaticVarClass s1 = new StaticVarClass();
    s1.number++;
    System.out.println(s1.number);

    StaticVarClass s2 = new StaticVarClass();
    s2.number++;
    System.out.println(s2.number);

    StaticVarClass s3 = new StaticVarClass();
    s3.number++;
    System.out.println(s3.number);
  }
}
