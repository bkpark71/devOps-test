package day8.chapter7;

public interface MyInterface {
  public static final int MAX = 10;

  public abstract void sayHello();
}

class Hello implements MyInterface {

  @Override
  public void sayHello() {
    System.out.println("Hello");
  }

  void myMethod(){
    System.out.println("this is mymethod");
  }
}