package day3.chapter4;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p1 ;
    p1 = new Phone();
    p1.model = "S24";
    p1.value = 140 ;
    p1.print();
    System.out.println(p1);

    Phone p2 = new Phone();
    p2.model = "Iphone";
    p2.value = 200;
    p2.print();
    System.out.println(p2);

    p1 = p2;
    System.out.println(p1);
    p1.print();
  }
}
