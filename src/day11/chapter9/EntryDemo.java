package day11.chapter9;

public class EntryDemo {
  public static void main(String[] args) {
    Entry<Integer,String> e1 = new Entry<>(1, "홍길동");
    //Entry<Integer,String> e2 = new Entry<>("홍길동", 1);
    Entry<Integer,String> e3 = new Entry<>(2, "손흥민");

    System.out.println(e1.getKey() + "번은 " + e1.getValue() + "입니다.");
    System.out.println(e3.getKey() + "번은 " + e3.getValue() + "입니다.");
    System.out.println(e1.getKey() * 0);

    Entry e4 = new Entry("1", "홍길동");
    Object key = e4.getKey();
    //if(key instanceof Integer) {
    //  int result = (Integer)key * 10;
      System.out.println((Integer)key * 10);
    // else {};


  }
}
