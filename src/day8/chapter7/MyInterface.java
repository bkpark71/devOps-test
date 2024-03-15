package day8.chapter7;

public interface MyInterface {
  int MAX = 10;

  void sayHello();
  default void say() {
    System.out.println("say");
  };
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

class Goodbye implements MyInterface{

  @Override
  public void sayHello() {
    System.out.println("Goodbye");
  }
}

class SaySomething implements MyInterface{

  @Override
  public void sayHello() {
    System.out.println("say hello");
  }

  @Override
  public void say() {
    System.out.println("say something");
  }
}