package day8.chapter7;

public class InterfaceDemo {
  public static void main(String[] args) {
      Hello hello = new Hello();
      hello.sayHello();
//      hello.say();
      System.out.println(hello.MAX);

      Goodbye goodbye = new Goodbye();
      goodbye.sayHello();
//      goodbye.say();

      SaySomething saySomething = new SaySomething();
      saySomething.say();
      saySomething.sayHello();
  }
}
