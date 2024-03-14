package day8.chapter6;

public class InstanceofDemo3 {
  public static void main(String[] args) {
    Korean k1 = new Korean("11111", "홍길동");
    Korean k2 = new Korean("11111", "김연아");
    Korean k3 = new Korean("22222", "홍길동");
    Korean k4 = new Korean("11111", "홍길동");

    if(k1.equals(k2)) {
      System.out.println("같은 사람입니다.");
    } else {
      System.out.println("다른 사람입니다.");
    }

    if(k1.equals(k3)) {
      System.out.println("같은 사람입니다.");
    } else {
      System.out.println("다른 사람입니다.");
    }

    if(k1.equals(k4)) {
      System.out.println("같은 사람입니다.");
    } else {
      System.out.println("다른 사람입니다.");
    }
  }
}
