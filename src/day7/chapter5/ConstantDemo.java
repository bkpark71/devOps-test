package day7.chapter5;

public class ConstantDemo {
  public static void main(String[] args) {
    final int MALE = 0;
    final int FEMALE = 1;
    final int EAST = 0;
    final int WEST = 1;
    int gender = FEMALE;
    int direction = EAST;

    if (gender == MALE) {
      System.out.println(gender + "은 병역 의무가 있다.");
    } else {
      System.out.println(gender + "은 병역 의무가 없다.");
    }

    if (gender != WEST) {
      System.out.println(gender + "은 병역 의무가 있다.");
    } else {
      System.out.println(gender + "은 병역 의무가 없다.");
    }

    if (direction == EAST) {
      System.out.println(direction + " 방향에서 해가 뜹니다.");
    } else {
      System.out.println(direction + " 방향으로 해가 집니다.");
    }
  }
}
