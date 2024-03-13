package day7.chapter5;

public class Exercise {
  public static void main(String[] args) {
    // 1. 월~일요일까지의 상수값을 가지는 enum class를 생성하라.

    // 2. 1.에서 만든 enum 타입의 (요일을 가리키는) 변수를 선언하고 수요일로 초기화하라.
    Week weekday = Week.SAT;
    // 3. 2의 변수를 이용해 오늘이 주중인지 주말인지를 출력하는 프로그램을 완성하라.
    switch (weekday) {
      case MON, TUE, WED , THU, FRI:
        System.out.println(weekday + "요일은 주중입니다.");
        break;
      case SAT, SUN :
        System.out.println(weekday + "요일은 주말입니다.");
    }
  }
}
