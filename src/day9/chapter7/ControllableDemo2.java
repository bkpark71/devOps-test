package day9.chapter7;

public class ControllableDemo2 {
  public static void main(String[] args) {
    Controllable[] controllables = {
        new TV(),
        new Computer(),
        new Notebook()
    };

    for (Controllable c : controllables) {
      c.turnOn();
      c.turnOff();
      c.repair();
      if (c instanceof Notebook n) {
        n.inMyBag();
      }
      Controllable.reset();
    }
  }
}
