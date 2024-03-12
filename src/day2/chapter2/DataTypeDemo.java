package day2.chapter2;

public class DataTypeDemo {
  public static void main(String[] args) {
    // 숫자를 문자로 변환
    char c1 = 3 ;
    char c2 = 3 + '0' ;
    int i1 = (int)c2;
    System.out.println("숫자 3의 문자는 " + c1);
    System.out.println("숫자 3 에 문자 '0'을 더한 결과는 문자 " + c2);
    System.out.println("숫자 3 에 문자 '0'을 더한 결과는 숫자 " + i1);

    // 문자를 숫자로 변환
    int i2 = '3' ;
    int i3 = '3' - '0';
    System.out.println("문자 3의 숫자는 " + i2);
    System.out.println("문자 3에서 문자0을 뺀 결과는 숫자 " + i3);

    // 숫자를 문자열로 변환
    String s1 = 3 + "" ;
    System.out.println("숫자 3을 문자열로 변환 " + s1);

    // 문자열을 숫자(정수)로 변환
    int number =Integer.parseInt(s1);
    System.out.println("문자열 3을 숫자로 변환 " + number);

    // 문자열을 숫자(실수)로 변환
    double d1 = Double.parseDouble("3.14");
    double d2 = d1 + 3.14;
    System.out.println("문자열 3.14를 숫자로 변환 " + d1);
    System.out.println(d2);

    // 문자를 문자열로 변환
    String s2 = '3' + "";
    System.out.println("문자 3을 문자열로 변환 " + s2);
    // 문자열을 문자로 변환
    char c4 = s2.charAt(0);
    System.out.println("문자열 3을 문자로 변환 " + c4);
  }
}
