package day9.chapter7;

public class ControllableDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    tv.repair();
    Controllable.reset();
    //tv.reset();

    Computer computer = new Computer();
    computer.turnOn();
    computer.turnOff();
    computer.repair();
    Controllable.reset();
    //computer.reset();
  }
}
