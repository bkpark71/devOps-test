package day2.chapter2;

public class CastDemo {
  public static void main(String[] args) {
    int i, j;
    double d;

    i = 7 / 4 ;  // i = 1
    System.out.println(i);

    d = 7 / 4 ; // d = (double)((int)7 / (int)4) = (double)1 = 1.0
    System.out.println(d);

    d = 7 / (double)4 ; // d = (double)7 / (double)4 = 7.0 / 4.0 = 1.75
    System.out.println(d);
    d = (double)7 / 4 ; // d = (double)7 / (double)4 = 7.0 / 4.0 = 1.75
    System.out.println(d);
    d = 7 / 4.0 ;
    System.out.println(d);

  }
}
