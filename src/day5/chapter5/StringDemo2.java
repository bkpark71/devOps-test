package day5.chapter5;

public class StringDemo2 {
  public static void main(String[] args) {
    String s1 = "Hi, Java!";
    String s2 = "Hi, Java!";
    String s3 = new String("Hi, Java!");
    String s4 = new String("Hi, Java!");

    System.out.println("s1 == s2 ? " + (s1 == s2));
    System.out.println("s1 == s3 ? " + (s1 == s3));

    s1 = s3;

    System.out.println("s1 == s2 ? " + (s1 == s2));
    System.out.println("s1 == s3 ? " + (s1 == s3));

    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));

    String s5 = "java";
    String s6 = "JAVA";
    // equals
    System.out.println(s5.equals(s6));
    System.out.println(s5.equalsIgnoreCase(s6));
    //compareTo
    System.out.println(s6.compareTo(s5));
    System.out.println(s5.compareToIgnoreCase(s6));
  }
}
