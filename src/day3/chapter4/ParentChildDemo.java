package day3.chapter4;

public class ParentChildDemo {
  public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Animal();
    a1.move();
    a2.move();

    a1.eat();
    a2.eat();

    Tiger t1 = new Tiger();
    t1.legs = 4;
    t1.move();
    t1.eat();

    Bird b1 = new Bird();
    b1.legs = 2;
    b1.eat();
    b1.move();
//    System.out.println(t1.legs + " 개의 다리가 있습니다.");
//    t1.legs = 10;
//    System.out.println(t1.legs + " 개의 다리가 있습니다.");
  }
}
