package day7.chapter5;

import java.util.Scanner;

public class StringMethodDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String url ;
    System.out.print("URL을 입력하세요 : ");
    url = in.nextLine();
    while (!url.equals("bye")){
      if (url.endsWith("com")) {
        System.out.println(url + """
            은 "com"으로 끝납니다.""");
      }
      if (url.contains("java")) {
        System.out.println(url + "은 \"java\"를 포함합니다.");
      }
    }
  }
}
