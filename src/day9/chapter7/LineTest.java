package day9.chapter7;

public class LineTest {
  public static void main(String[] args) {
    Line l1 = new Line(10);
    Line l2 = new Line(20);

    if(l1.compareTo(l2) < 0)
      System.out.println(l2 + "가 더 깁니다.");
    else if(l1.compareTo(l2) > 0)
      System.out.println(l1 + "가 더 깁니다.");
    else
      System.out.println("두 라인의 길이가 같습니다.");
  }
}
