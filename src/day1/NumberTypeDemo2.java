package day1;

public class NumberTypeDemo2 {
  public static void main(String[] args) {
    final float PI ;
    PI = (float)3.14159;
    double radius = 10.0;
    //PI = 3.14f;
    double area = radius * radius * PI ;
    System.out.println("반지름이 " + radius + "인 원의 넓이는 "+ area + "입니다.");

    double area1 = radius * radius * PI ;
    double area_other = 3.14 ;

    byte b = 100;
    int i = 128;
    b = (byte)300 ;
    System.out.println(b);
  }
}
