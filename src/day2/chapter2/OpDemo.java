package day2.chapter2;

public class OpDemo {
  public static void main(String[] args) {
    // 1. 증감연산자 ++ , --
    int i = 1;
    System.out.println(i);
    i = i + 1;
    System.out.println(i);
    i += 1;
    System.out.println(i);
    i++ ;
    ++i;
    System.out.println(i);
    i = i -1 ;
    System.out.println(i);
    i -= 1;
    System.out.println(i);
    i--;
    --i;
    System.out.println(i);
    //2. 산술연산자 + - * / %(나머지)
    int j = 1 % 2;
    System.out.println("1은 홀수입니다.");
    int k = 2 % 2;
    System.out.println("2는 짝수입니다.");
    //3. 비교연산
    boolean b = j <= k; // 1 <= 0
    System.out.println(b);
    //4. 논리연산
    // true AND true ==> true
    // false AND ~~~~ ==> false
    boolean b1 = 1 > 0 && 2 < 1;
    System.out.println(b1);
    // true OR ~~~ ==> true
    // false OR false ==> false
    boolean b2 = 1 > 0 || 0 == 1;
    boolean b3 = 1 < 0 || 0 == 1;
    System.out.println(b2);
    System.out.println(b3);
    // !
    boolean b5 = !b3 ;
    System.out.println(b5);
    //5. 조건연산 (삼항연산)
    boolean b4 = (1 != 1) ? true : false;
    System.out.println(b4);

    int i1 = (1 == 1) ? 10 : 20;
    System.out.println(i1);

    String s = (1 == 1) ? "hello" : "world";
    System.out.println(s);
  }
}
