package day9.chapter7;

public class TriangleTest {
  public static void main(String[] args) {
    Triangle triangle1 = new Triangle(10,10);
    Triangle triangle2 = new Triangle(5,10);

    int compareResult = triangle1.compareTo(triangle2);
    System.out.println(compareResult);
    if(compareResult == -999) {
      System.out.println("두 객체의 크기를 비교할 수 없거나 ");
    }
    if(compareResult < 0) {
      System.out.println(triangle2 + "가 더 큽니다.");
    } else if (compareResult > 0) {
      System.out.println(triangle1 + "가 더 큽니다.");
    } else {
      System.out.printf("%s 과 %s 의 크기가 동일합니다.",triangle1, triangle2);
    }
  }
}
