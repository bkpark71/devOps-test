package day4.chapter4;

public class CarDemo {
  public static void main(String[] args) {
    Car c1 = new Car("소나타", "black");
//    System.out.println(Car.sequence);
    Car c2 = new Car("아이오닉", "white");
//    System.out.println(Car.sequence);
    Car c3 = new Car("아이오닉", "white");
//    System.out.println(Car.sequence);
    Car c4 = new Car("아이오닉", "white");
//    System.out.println(Car.sequence);

    c1.setDirection("D");
    c1.go();
    c1.setDirection("R");
    c1.go();
    System.out.println(c1.getSerialNo());
    System.out.println(c2.getSerialNo());
    System.out.println(c3.getSerialNo());
    System.out.println(c4.getSerialNo());
//    System.out.println(Car.sequence);
  }
}
