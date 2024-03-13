package day7.chapter5;

public class CountCharDemo {
  public static void main(String[] args) {
    System.out.println(countChar("hello", 'l'));
    System.out.println(countChar("hello", 'L'));
    System.out.println(countChar("HELLo", 'l'));
  }

  static int countChar(String s, char c){
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if(s.toUpperCase().charAt(i) == Character.toUpperCase(c)) count++;
    }

    return count;
  }
}
