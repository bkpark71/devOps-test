package day10.chapter8.generic;

public class GenericClassDemo2 {
  public static void main(String[] args) {
    Cup<Beer> c = new Cup<>();

    c.setBeverage(new Beer());
    Beer beverage = c.getBeverage();
    beverage.drink();

    Cup<Boricha> c1 = new Cup<>();
    c1.setBeverage(new Boricha());
    Boricha beverage1 = c1.getBeverage();
    beverage1.drink();
    //c1.setBeverage(new Beer());
    //c.setBeverage(new Boricha());

    //if(beverage instanceof Beer) {
    //  Beer b = (Beer)beverage;
    //}

//    c.setBeverage(new Boricha());
//    Object beverage1 = c.getBeverage();
//    //Beer b1 = (Beer)beverage1;
//
//    if(beverage1 instanceof Boricha) {
//      Boricha br = (Boricha) beverage1;
//    }
  }
}

class Beverage {
  void drink(){
    System.out.println("음료수를 마신다.");
  }
}

class Beer extends Beverage {
  void drink(){
    System.out.println("맥주를 마신다.");
  }
}

class Boricha extends Beverage {
  void drink(){
    System.out.println("보리차를 마신다.");
  }
}

class Cup<T> {
  private T beverage;

  public T getBeverage() {
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}