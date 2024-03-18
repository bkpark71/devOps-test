package day10.chapter8;

public class GenericClassDemo1 {
  public static void main(String[] args) {
    Cup c = new Cup();

    c.setBeverage(new Beer());
    Object beverage = c.getBeverage();
    if(beverage instanceof Beer) {
      Beer b = (Beer)beverage;
    }

    c.setBeverage(new Boricha());
    Object beverage1 = c.getBeverage();
    //Beer b1 = (Beer)beverage1;

    if(beverage1 instanceof Boricha) {
      Boricha br = (Boricha) beverage1;
    }
  }
}

class Beverage {
}

class Beer extends Beverage {

}

class Boricha extends Beverage {

}

class Cup {
  private Object beverage;

  public Object getBeverage() {
    return beverage;
  }

  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}