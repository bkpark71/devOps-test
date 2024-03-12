package day3.chapter3;

import java.util.Scanner;

public class SwitchDemo2 {
  public static void main(String[] args) {
    // 1. 동물종류를 키보드를 통해 입력을 받는다.
    Scanner in = new Scanner(System.in);
    System.out.println("동물을 입력하세요 : ");
    String animal = in.nextLine();
    String kind = "";

//    final int ONE = 1 ;
//    int result = 1 ;
//    int num = 10;
//    switch (result) {
//      case ONE :
//        System.out.println("1입니다.");
//      case 1.0 :
//        System.out.println("1.0입니다.");
//    }

    switch (animal) {
      case "호랑이" :
      case "사자" :
        kind = "포유류";
        break;
      case "독수리" :
      case "참새" :
        kind = "조류";
        break;
      case "고등어" :
      case "참치" :
        kind = "어류";
        break;
      default:
        System.out.print("어이쿠 ! ");
        kind = "...";
    }
    System.out.printf("%s는 %s입니다.\n", animal, kind);

    switch (animal) {
      case "호랑이", "사자"  -> kind = "포유류";
      case "독수리" , "참새"  -> kind = "조류";
      case "고등어" ,"참치"  -> kind = "어류";
      default -> {
        System.out.print("어이쿠 ! ");
        kind = "...";
      }
    }
    System.out.printf("%s는 %s입니다.\n", animal, kind);

    kind = switch (animal) {
      case "호랑이", "사자"  -> "포유류";
      case "독수리" , "참새"  -> "조류";
      case "고등어" ,"참치"  -> "어류";
      default -> {
        System.out.print("어이쿠 ! ");
        yield "...";
      }
    };
    System.out.printf("%s는 %s입니다.\n", animal, kind);
  }
}
